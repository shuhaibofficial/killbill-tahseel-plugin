package org.killbill.billing.plugin.tahseel;

import org.killbill.billing.plugin.api.payment.PluginPaymentMethodInfoPlugin;
import org.killbill.billing.plugin.api.payment.PluginPaymentMethodPlugin;
import org.killbill.billing.plugin.tahseel.dao.TahseelDao;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelPaymentMethodsRecord;

import java.util.UUID;

public class TahseelPaymentMethodPlugin extends PluginPaymentMethodPlugin {

    public TahseelPaymentMethodPlugin(final TahseelPaymentMethodsRecord record) {
        super(record.getKbPaymentMethodId() == null ? null : UUID.fromString(record.getKbPaymentMethodId()),
                record.getTahseelId(),
                (record.getIsDefault() != null) && TahseelDao.TRUE == record.getIsDefault(),
                TahseelModelPluginBase.buildPluginProperties(record.getAdditionalData()));
    }
}
