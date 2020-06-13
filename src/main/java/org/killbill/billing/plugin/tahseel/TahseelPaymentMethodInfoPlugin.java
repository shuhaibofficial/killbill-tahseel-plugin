package org.killbill.billing.plugin.tahseel;

import org.killbill.billing.plugin.api.payment.PluginPaymentMethodInfoPlugin;
import org.killbill.billing.plugin.api.payment.PluginPaymentMethodInfoPlugin;
import org.killbill.billing.plugin.tahseel.dao.TahseelDao;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelPaymentMethodsRecord;
import java.util.UUID;

public class TahseelPaymentMethodInfoPlugin extends PluginPaymentMethodInfoPlugin {
    public TahseelPaymentMethodInfoPlugin(final TahseelPaymentMethodsRecord record) {
        super(UUID.fromString(record.getKbAccountId()),
                UUID.fromString(record.getKbPaymentMethodId()),
                record.getIsDefault() == TahseelDao.TRUE,
                record.getTahseelId());
    }
}
