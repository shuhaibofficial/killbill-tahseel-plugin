package org.killbill.billing.plugin.tahseel;

import java.math.BigDecimal;
import java.util.*;

import javax.annotation.Nullable;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.payment.api.PluginProperty;
import org.killbill.billing.payment.api.TransactionType;
import org.killbill.billing.payment.plugin.api.PaymentPluginStatus;
import org.killbill.billing.plugin.api.PluginProperties;
import org.killbill.billing.plugin.api.payment.PluginPaymentTransactionInfoPlugin;
import org.killbill.billing.plugin.tahseel.dao.TahseelDao;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelResponsesRecord;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.firstdata.payeezy.models.transaction.TransactionResponse;
import com.google.common.base.Strings;

public class TahseelPaymentTransactionInfoPlugin extends PluginPaymentTransactionInfoPlugin {





    public TahseelPaymentTransactionInfoPlugin(final UUID kbPaymentId, final UUID kbTransactionPaymentPaymentId,
                                              final TransactionType transactionType,
                                              final BigDecimal amount, final String currency,
                                              final String gatewayError, final String gatewayErrorCode,
                                              final List<PluginProperty> properties) {
        super(kbPaymentId,
                kbTransactionPaymentPaymentId,
                transactionType,
                amount,
                Currency.valueOf(currency),
                PaymentPluginStatus.PENDING,
                gatewayError,
                gatewayErrorCode,
                null,
                null,
                DateTime.now(),
                DateTime.now(),
                properties);
    }

    public TahseelPaymentTransactionInfoPlugin(final UUID kbPaymentId, final UUID kbTransactionPaymentPaymentId,
                                               final TransactionType transactionType,
                                               final BigDecimal amount, PaymentPluginStatus pending, String status_code, String status_message, final String currency,
                                               final List<PluginProperty> properties, DateTime dateTime, DateTime now, Iterable<PluginProperty> pluginProperties) {
        super(kbPaymentId,
                kbTransactionPaymentPaymentId,
                transactionType,
                amount,
                Currency.valueOf(currency),
                PaymentPluginStatus.ERROR,
                "Not supported",
                null,
                null,
                null,
                DateTime.now(),
                DateTime.now(),
                properties);
    }


    public TahseelPaymentTransactionInfoPlugin(TahseelResponsesRecord record) {
        super(UUID.fromString(record.getKbPaymentId()),
                UUID.fromString(record.getKbPaymentTransactionId()),
                TransactionType.valueOf(record.getTransactionType()),
                record.getAmount(),
                Strings.isNullOrEmpty(record.getCurrency()) ? null : Currency.valueOf(record.getCurrency()),
                getPaymentPluginStatus(record.getStatusCode()),
                record.getStatusCode(),
                record.getStatusMessage(),
                record.getTahseelBillingAccount(),
                null,
                new DateTime(record.getCreatedDate(), DateTimeZone.UTC),
                new DateTime(record.getCreatedDate(), DateTimeZone.UTC),
                TahseelModelPluginBase.buildPluginProperties(record.getAdditionalData()));
    }
    protected static PaymentPluginStatus getPaymentPluginStatus(final String status_code) {


        if ("processed".equals(status_code)) {
            return PaymentPluginStatus.PROCESSED;
        } else if ("I000000".equals(status_code)) {
            // Untestable - see https://stripe.com/docs/ach#ach-payments-workflow
            return PaymentPluginStatus.PENDING;
        }
         else if (status_code.startsWith("E")) {
            // TODO Do better (look at the type of error to narrow down on CANCELED)!
            return PaymentPluginStatus.ERROR;
        } else {
            return PaymentPluginStatus.UNDEFINED;
        }
    }


}
