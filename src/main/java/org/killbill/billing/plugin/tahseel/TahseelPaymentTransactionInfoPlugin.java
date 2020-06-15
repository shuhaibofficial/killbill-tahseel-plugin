package org.killbill.billing.plugin.tahseel;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Nullable;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.payment.api.PluginProperty;
import org.killbill.billing.payment.api.TransactionType;
import org.killbill.billing.payment.plugin.api.PaymentPluginStatus;
import org.killbill.billing.plugin.api.payment.PluginPaymentTransactionInfoPlugin;
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
                PaymentPluginStatus.PENDING,
                "Not supported",
                null,
                null,
                null,
                DateTime.now(),
                DateTime.now(),
                properties);
    }


}
