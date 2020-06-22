package org.killbill.billing.plugin.tahseel;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import org.joda.time.DateTime;
import org.killbill.billing.account.api.Account;
import org.killbill.billing.account.api.AccountApiException;
import org.killbill.billing.osgi.libs.killbill.OSGIKillbillAPI;
import org.killbill.billing.payment.api.*;
import org.killbill.billing.payment.plugin.api.PaymentPluginApiException;
import org.killbill.billing.payment.plugin.api.PaymentPluginStatus;
import org.killbill.billing.plugin.tahseel.client.model.Item;
import org.killbill.billing.plugin.tahseel.dao.TahseelDao;
import org.killbill.billing.plugin.tahseel.JsonHelper;

import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelResponsesRecord;
import org.killbill.billing.util.callcontext.CallContext;
import org.killbill.billing.util.callcontext.TenantContext;
import org.killbill.clock.Clock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.UUID;

import static java.lang.String.valueOf;
//import static org.killbill.billing.plugin.api.core.PaymentApiWrapper.filterForTransaction;

//import static org.killbill.billing.plugin.dwolla.client.EventTopic.valueOf;

public class TahseelNotificationHandler {
    private static final Logger logger = LoggerFactory.getLogger(TahseelNotificationHandler.class);

    private final TahseelDao dao;
    //private final DwollaClient client;
    private final OSGIKillbillAPI osgiKillbillAPI;
    private final Clock clock;

    public TahseelNotificationHandler(TahseelDao dao, OSGIKillbillAPI osgiKillbillAPI, Clock clock) {
        this.dao = dao;
        this.osgiKillbillAPI = osgiKillbillAPI;
        this.clock = clock;
    }

    public void processNotification(final String notification, final UUID tenantId) throws PaymentPluginApiException, IOException, SQLException {
        final Item item = JsonHelper.getObjectFromRequest(notification, Item.class);

        UUID kbAccountId = null;
        UUID kbPaymentId = null;
        UUID kbPaymentTransactionId = null;
        UUID kbTenantId = null;
        //TransactionType transactionType = null;
        try{
            // Check if we have a record for that pspReference (PENDING auth, capture, refund, etc.)
            PaymentPluginStatus status = getPaymentStatusUpdated(item.getPaymentStatusCode());
            final TahseelResponsesRecord record = dao.getResponseByBillingAccount(item.getBillAccount());
            if(record != null){
                kbAccountId = UUID.fromString(record.getKbAccountId());
                kbTenantId = UUID.fromString(record.getKbTenantId());
                kbPaymentId = UUID.fromString(record.getKbPaymentId());
                kbPaymentTransactionId = UUID.fromString(record.getKbPaymentTransactionId());
                updateKillbill(kbAccountId,
                        kbPaymentId,
                        kbPaymentTransactionId,
                        status, clock.getUTCNow(), tenantId);
                dao.updateResponseStatus(item.getPaymentStatusCode(), item.getBillAccount(), tenantId);

            }
            dao.addNotification(item, kbAccountId, kbPaymentId, kbPaymentTransactionId, null, clock.getUTCNow(), tenantId);
        }
        catch (Exception e) {
            if (e.getCause() instanceof SQLIntegrityConstraintViolationException) {
                logger.debug("Tahseel Plugin notification was already processed but Sql SQLIntegrityConstraintViolationException");
                return;
            } else {
                logger.error("Error saving the Notification in database", e);
                throw new PaymentPluginApiException("Error saving Notification in database", e);
            }

        }
        finally {
                    try {
                        dao.addNotification(item, null, null, null, null, clock.getUTCNow(), tenantId);
                    } catch (Exception e) {
                        if (e.getCause() instanceof SQLIntegrityConstraintViolationException) {
                            logger.debug("Tahseel Plugin notification was already processed but Sql SQLIntegrityConstraintViolationException");
                            return;
                        } else {
                            logger.error("Error saving the Notification in database", e);
                            throw new PaymentPluginApiException("Error saving Notification in database", e);
                        }

                    }

        }

    }

    private Payment updateKillbill(@Nullable final UUID kbAccountId,
                                   @Nullable final UUID kbPaymentId,
                                   @Nullable final UUID kbPaymentTransactionId,
                                   final PaymentPluginStatus paymentPluginStatus,
                                   final DateTime utcNow,
                                   @Nullable final UUID kbTenantId) {
        if (kbPaymentId != null) {
            Preconditions.checkNotNull(kbTenantId, String.format("kbTenantId null for kbPaymentId='%s'", kbPaymentId));
            Preconditions.checkNotNull(kbAccountId, String.format("kbAccountId null for kbPaymentId='%s'", kbPaymentId));
            final CallContext context = new TahseelCallContext(utcNow,kbAccountId,kbTenantId);

            final Payment payment = getPayment(kbPaymentId, context);

            Preconditions.checkArgument(payment.getAccountId().equals(kbAccountId), String.format("kbAccountId='%s' doesn't match payment#accountId='%s'", kbAccountId, payment.getAccountId()));
            final Account account = getAccount(kbAccountId, context);

            PaymentTransaction paymentTransaction = filterForTransaction(payment, kbPaymentTransactionId);
            Preconditions.checkNotNull(paymentTransaction, String.format("kbPaymentTransactionId='%s' not found for kbPaymentId='%s'", kbPaymentTransactionId, kbPaymentId));

            // Update Kill Bill
            if (PaymentPluginStatus.UNDEFINED.equals(paymentPluginStatus)) {
                // We cannot do anything
                return payment;
            } else if (paymentTransaction != null && TransactionStatus.PENDING.equals(paymentTransaction.getTransactionStatus())) {
                return transitionPendingTransaction(account, kbPaymentTransactionId, paymentPluginStatus, context);
            } else {
                // Payment in Kill Bill has the latest state, nothing to do (we simply updated our plugin tables in case Dwolla had extra information for us)
                return payment;
            }
        } else {
            // API payment unknown to Kill Bill, does it belong to a different system?
            // Note that we could decide to record a new payment here, this would be useful to migrate data for instance
            return null;
        }
    }
        //KILL BILL API
    private Payment getPayment(final UUID kbPaymentId, final TenantContext context) {
        try {
            return osgiKillbillAPI.getPaymentApi().getPayment(kbPaymentId, true, false, ImmutableList.<PluginProperty>of(), context);
        } catch (final PaymentApiException e) {
            // Have Tahseel retry
            throw new RuntimeException(String.format("Failed to retrieve kbPaymentId='%s'", kbPaymentId), e);
        }
    }
    //KILL BILL API
    private Account getAccount(final UUID kbAccountId, final TenantContext context) {
        try {
            return osgiKillbillAPI.getAccountUserApi().getAccountById(kbAccountId, context);
        } catch (final AccountApiException e) {
            // Have Tahseel retry
            throw new RuntimeException(String.format("Failed to retrieve kbAccountId='%s'", kbAccountId), e);
        }
    }
    //KILL BILL API
    private PaymentTransaction filterForTransaction(final Payment payment, final UUID kbTransactionId) {
        for (final PaymentTransaction paymentTransaction : payment.getTransactions()) {
            if (paymentTransaction.getId().equals(kbTransactionId)) {
                return paymentTransaction;
            }
        }
        return null;
    }
    //KILL BILL API
    private Payment transitionPendingTransaction(final Account account, final UUID kbPaymentTransactionId, final PaymentPluginStatus paymentPluginStatus, final CallContext context) {
        try {
            return osgiKillbillAPI.getPaymentApi().notifyPendingTransactionOfStateChanged(account, kbPaymentTransactionId, paymentPluginStatus == PaymentPluginStatus.PROCESSED, context);
        } catch (final PaymentApiException e) {
            // Have Dwolla retry
            throw new RuntimeException(String.format("Failed to transition pending transaction kbPaymentTransactionId='%s'", kbPaymentTransactionId), e);
        }
    }


    private PaymentPluginStatus getPaymentStatusUpdated(final String PaymentStatusCode) {
        switch (PaymentStatusCode.toUpperCase()) {
            case "SUCCEEDED":
                return PaymentPluginStatus.PROCESSED;
            case "FAILED":
            case "CANCELLED":
                return PaymentPluginStatus.ERROR;
        }
        return null;
    }







}
