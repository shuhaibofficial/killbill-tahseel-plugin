/*
 * Copyright 2014-2015 Groupon, Inc
 * Copyright 2014-2015 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.plugin.tahseel;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.*;

import org.joda.time.DateTime;
import org.killbill.billing.account.api.Account;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.osgi.libs.killbill.OSGIKillbillLogService;
import org.killbill.billing.osgi.libs.killbill.OSGIConfigPropertiesService;
import org.killbill.billing.osgi.libs.killbill.OSGIKillbillAPI;
import org.killbill.billing.payment.api.PaymentMethodPlugin;
import org.killbill.billing.payment.api.PluginProperty;
import org.killbill.billing.payment.api.TransactionType;
import org.killbill.billing.payment.plugin.api.*;
import org.killbill.billing.plugin.api.PluginProperties;
import org.killbill.billing.plugin.api.payment.PluginPaymentPluginApi;
import org.killbill.billing.plugin.tahseel.cxf.com.ejada.BillManageRsType;
import org.killbill.billing.plugin.tahseel.cxf.com.ejada.SoapClientTest;
import org.killbill.billing.util.callcontext.CallContext;
import org.killbill.billing.util.callcontext.TenantContext;
import org.killbill.billing.util.entity.Pagination;
import org.killbill.billing.plugin.tahseel.dao.TahseelDao;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelPaymentMethods;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelResponses;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelPaymentMethodsRecord;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelResponsesRecord;
import org.killbill.clock.Clock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.killbill.billing.plugin.tahseel.TahseelPaymentTransactionInfoPlugin.getPaymentPluginStatus;

//
// A 'real' payment plugin would of course implement this interface.
//
public class TahseelPaymentPluginApi extends PluginPaymentPluginApi <TahseelResponsesRecord, TahseelResponses, TahseelPaymentMethodsRecord, TahseelPaymentMethods>{
    private static final Logger logger = LoggerFactory.getLogger(TahseelPaymentPluginApi.class);
   //private final Properties properties;

    public static final String PROPERTY_BILLINGACCT = "billing account";
    public static final String PROPERTY_AGENCYID= "agency id";
    private final OSGIKillbillLogService logService;
    private final TahseelConfigurationHandler tahseelConfigurationHandler;
    private final TahseelNotificationHandler notificationHandler;
    private final TahseelDao dao;

    public TahseelPaymentPluginApi(TahseelConfigurationHandler tahseelConfigurationHandler,
                                   final OSGIKillbillAPI killbillApi,
                                   final OSGIConfigPropertiesService osgiConfigPropertiesService,
                                   final OSGIKillbillLogService logService,
                                   final Clock clock,
                                   final TahseelDao dao, TahseelNotificationHandler notificationHandler) {
        super(killbillApi, osgiConfigPropertiesService, logService,clock,dao);
        this.logService = logService;
        this.tahseelConfigurationHandler = tahseelConfigurationHandler;
        this.dao = dao;
        this.notificationHandler = notificationHandler;
    }

    @Override
    public PaymentTransactionInfoPlugin authorizePayment(final UUID kbAccountId, final UUID kbPaymentId, final UUID kbTransactionId, final UUID kbPaymentMethodId, final BigDecimal amount, final Currency currency, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public PaymentTransactionInfoPlugin capturePayment(final UUID kbAccountId, final UUID kbPaymentId, final UUID kbTransactionId, final UUID kbPaymentMethodId, final BigDecimal amount, final Currency currency, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public PaymentTransactionInfoPlugin purchasePayment(final UUID kbAccountId, final UUID kbPaymentId, final UUID kbTransactionId, final UUID kbPaymentMethodId, final BigDecimal amount, final Currency currency, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {
       // final TahseelResponsesRecord tahseelResponsesRecord;
       // try {
         //   tahseelResponsesRecord = dao.updateResponse(kbTransactionId, properties, context.getTenantId());
        //} catch (final SQLException e) {
         //   throw new PaymentPluginApiException("HPP notification came through, but we encountered a database error", e);
        //}

            //final String Status="SUCCESS";
            return executeInitialTransaction(TransactionType.PURCHASE,kbAccountId, kbPaymentId, kbTransactionId, kbPaymentMethodId, amount, currency, properties, context);

            // We already have a record for that payment transaction and we just updated the response row with additional properties
            // (the API can be called for instance after the user is redirected back from the HPP)



    }

    @Override
    public PaymentTransactionInfoPlugin voidPayment(final UUID kbAccountId, final UUID kbPaymentId, final UUID kbTransactionId, final UUID kbPaymentMethodId, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public PaymentTransactionInfoPlugin creditPayment(final UUID kbAccountId, final UUID kbPaymentId, final UUID kbTransactionId, final UUID kbPaymentMethodId, final BigDecimal amount, final Currency currency, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public PaymentTransactionInfoPlugin refundPayment(final UUID kbAccountId, final UUID kbPaymentId, final UUID kbTransactionId, final UUID kbPaymentMethodId, final BigDecimal amount, final Currency currency, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    protected PaymentTransactionInfoPlugin buildPaymentTransactionInfoPlugin(TahseelResponsesRecord record) {
        return new TahseelPaymentTransactionInfoPlugin(record);
    }

    @Override
    protected PaymentMethodPlugin buildPaymentMethodPlugin(TahseelPaymentMethodsRecord record) {
        return new TahseelPaymentMethodPlugin(record);
    }

    @Override
    protected PaymentMethodInfoPlugin buildPaymentMethodInfoPlugin(TahseelPaymentMethodsRecord record) {
        return new TahseelPaymentMethodInfoPlugin(record);
    }

    @Override
    protected String getPaymentMethodId(TahseelPaymentMethodsRecord input) {

        return input.getKbPaymentMethodId();
    }

    @Override
    public List<PaymentTransactionInfoPlugin> getPaymentInfo(final UUID kbAccountId, final UUID kbPaymentId, final Iterable<PluginProperty> properties, final TenantContext context) throws PaymentPluginApiException {
        final List<PaymentTransactionInfoPlugin> transactions = super.getPaymentInfo(kbAccountId, kbPaymentId, properties, context);
        if (transactions.isEmpty()) {
            // We don't know about this payment (maybe it was aborted in a control plugin)
            return transactions;
        }
        return transactions;
    }

    @Override
    public Pagination<PaymentTransactionInfoPlugin> searchPayments(final String searchKey, final Long offset, final Long limit, final Iterable<PluginProperty> properties, final TenantContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public void addPaymentMethod(final UUID kbAccountId, final UUID kbPaymentMethodId, final PaymentMethodPlugin paymentMethodProps, final boolean setDefault, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {
        final Iterable<PluginProperty> allProperties = PluginProperties.merge(paymentMethodProps.getProperties(), properties);
        String objectType = PluginProperties.getValue("object", "payment_method", allProperties);
        String paymentMethodIdIn = PluginProperties.findPluginPropertyValue("tahseelid", allProperties);
        final DateTime utcNow = clock.getUTCNow();
        final Map<String, Object> additionalDataMap = new HashMap<>(); //plugins or payment method data
        try {
            dao.addPaymentMethod(kbAccountId, kbPaymentMethodId,setDefault, additionalDataMap, paymentMethodIdIn, utcNow, context.getTenantId());
        } catch (final SQLException e) {
            throw new PaymentPluginApiException("Unable to add payment method", e);
        }


    }

    @Override
    public void deletePaymentMethod(final UUID kbAccountId, final UUID kbPaymentMethodId, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {

    }

    @Override
    public PaymentMethodPlugin getPaymentMethodDetail(final UUID kbAccountId, final UUID kbPaymentMethodId, final Iterable<PluginProperty> properties, final TenantContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public void setDefaultPaymentMethod(final UUID kbAccountId, final UUID kbPaymentMethodId, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {

    }

    @Override
    public List<PaymentMethodInfoPlugin> getPaymentMethods(final UUID kbAccountId, final boolean refreshFromGateway, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public Pagination<PaymentMethodPlugin> searchPaymentMethods(final String searchKey, final Long offset, final Long limit, final Iterable<PluginProperty> properties, final TenantContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public void resetPaymentMethods(final UUID kbAccountId, final List<PaymentMethodInfoPlugin> paymentMethods, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {

    }

    @Override
    public HostedPaymentPageFormDescriptor buildFormDescriptor(final UUID kbAccountId, final Iterable<PluginProperty> customFields, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {
        return null;
    }

    @Override
    public GatewayNotification processNotification(final String notification, final Iterable<PluginProperty> properties, final CallContext context) throws PaymentPluginApiException {
        String json = "";
        try {
            json=notificationHandler.processNotification(notification, context.getTenantId());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new TahseelGatewayNotification(json);
    }
    private PaymentTransactionInfoPlugin executeInitialTransaction(final TransactionType transactionType,
                                                                   final UUID kbAccountId,
                                                                   final UUID kbPaymentId,
                                                                   final UUID kbTransactionId,
                                                                   final UUID kbPaymentMethodId,
                                                                   final BigDecimal amount,
                                                                   final Currency currency,
                                                                   final Iterable<PluginProperty> properties,
                                                                   final CallContext context) throws PaymentPluginApiException {
        final Account account = getAccount(kbAccountId, context);
        final TahseelPaymentMethodsRecord PaymentMethod = getTahseelPaymentMethod(kbPaymentMethodId, context);
        final DateTime utcNow = clock.getUTCNow();
        final long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L; //Generating some tahseel id/BillAcct
        final String tahseel_billing_aacount = String.valueOf(number);
        final UUID tahseel_rq_uid = UUID.randomUUID();
        String status_code = "E999999";
        String status_message = "Unrecoverable integration error default";
        try{
            SoapClientTest soapCall = new SoapClientTest();
            BillManageRsType soapResponse=soapCall.callSoapService();
            status_code = soapResponse.getMsgRsHdr().getResponseStatus().getStatusCode();
            status_message = soapResponse.getMsgRsHdr().getResponseStatus().getStatusDesc();
        }
        catch (final Exception e) {
            throw new PaymentPluginApiException("Web Soap service Error ", e);
        }

        try {
            final TahseelResponsesRecord responsesRecord = dao.addResponse(kbAccountId, kbPaymentId, kbTransactionId, transactionType, amount, currency,tahseel_billing_aacount, tahseel_rq_uid,status_code,status_message, utcNow, context.getTenantId());
            return new TahseelPaymentTransactionInfoPlugin(
                    kbPaymentId,
                    kbPaymentMethodId,
                    transactionType,
                    amount,
                    currency,
                    getPaymentPluginStatus(status_code),
                    status_code,
                    status_message,
                    tahseel_rq_uid.toString(),
                    tahseel_rq_uid.toString(),
                    DateTime.now(),
                    DateTime.now(),
                    properties);
        } catch (final SQLException e) {
            throw new PaymentPluginApiException("Payment went through, but we encountered a database error. Payment details: ", e);
        }
    }
    private TahseelPaymentMethodsRecord getTahseelPaymentMethod(UUID kbPaymentMethodId, CallContext context) throws PaymentPluginApiException {
        TahseelPaymentMethodsRecord paymentMethod;
        try {
            paymentMethod = dao.getPaymentMethod(kbPaymentMethodId, context.getTenantId());
        } catch (SQLException e) {
            throw new PaymentPluginApiException("There was an error trying to load Tahseel payment method for KillBill payment method " + kbPaymentMethodId, e);
        }

        if (paymentMethod == null) {
            throw new PaymentPluginApiException(null, "No Tahseel payment method was found for killbill payment method " + kbPaymentMethodId);
        }
        return paymentMethod;
    }
}
