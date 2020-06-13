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

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.*;

import org.joda.time.DateTime;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.osgi.libs.killbill.OSGIKillbillLogService;
import org.killbill.billing.osgi.libs.killbill.OSGIConfigPropertiesService;
import org.killbill.billing.osgi.libs.killbill.OSGIKillbillAPI;
import org.killbill.billing.payment.api.PaymentMethodPlugin;
import org.killbill.billing.payment.api.PluginProperty;
import org.killbill.billing.payment.plugin.api.GatewayNotification;
import org.killbill.billing.payment.plugin.api.HostedPaymentPageFormDescriptor;
import org.killbill.billing.payment.plugin.api.PaymentMethodInfoPlugin;
import org.killbill.billing.payment.plugin.api.PaymentPluginApi;
import org.killbill.billing.plugin.api.PluginProperties;
import org.killbill.billing.plugin.api.payment.PluginPaymentPluginApi;
import org.killbill.billing.payment.plugin.api.PaymentPluginApiException;
import org.killbill.billing.payment.plugin.api.PaymentTransactionInfoPlugin;
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

//
// A 'real' payment plugin would of course implement this interface.
//
public class TahseelPaymentPluginApi extends PluginPaymentPluginApi <TahseelResponsesRecord, TahseelResponses, TahseelPaymentMethodsRecord, TahseelPaymentMethods>{
    private static final Logger logger = LoggerFactory.getLogger(TahseelPaymentPluginApi.class);
   //private final Properties properties;

    public static final String PROPERTY_BILLINGACCT = "billing account";
    public static final String PROPERTY_AGENCYID= "agency id";
    private final OSGIKillbillLogService logService;

    private final TahseelDao dao;

    public TahseelPaymentPluginApi(final OSGIKillbillAPI killbillApi,
                                   final OSGIConfigPropertiesService osgiConfigPropertiesService,
                                   final OSGIKillbillLogService logService,
                                   final Clock clock,
                                   final TahseelDao dao) {
        super(killbillApi, osgiConfigPropertiesService, logService,clock,dao);
        this.logService = logService;
        this.dao = dao;
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
        return null;
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
        return null;
    }

    @Override
    protected PaymentMethodPlugin buildPaymentMethodPlugin(TahseelPaymentMethodsRecord record) {
        return null;
    }

    @Override
    protected PaymentMethodInfoPlugin buildPaymentMethodInfoPlugin(TahseelPaymentMethodsRecord record) {
        return null;
    }

    @Override
    protected String getPaymentMethodId(TahseelPaymentMethodsRecord input) {
        return null;
    }

    @Override
    public List<PaymentTransactionInfoPlugin> getPaymentInfo(final UUID kbAccountId, final UUID kbPaymentId, final Iterable<PluginProperty> properties, final TenantContext context) throws PaymentPluginApiException {
        return null;
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
        final Map<String, Object> additionalDataMap = new HashMap<String, Object>();
        try {
            dao.addPaymentMethod(kbAccountId, kbPaymentMethodId, additionalDataMap, paymentMethodIdIn, utcNow, context.getTenantId());
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
        return null;
    }
}
