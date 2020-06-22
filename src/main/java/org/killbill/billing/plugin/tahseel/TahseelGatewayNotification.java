package org.killbill.billing.plugin.tahseel;

import org.killbill.billing.payment.plugin.api.GatewayNotification;
import org.killbill.billing.plugin.api.payment.PluginGatewayNotification;

public class TahseelGatewayNotification extends PluginGatewayNotification {
    public TahseelGatewayNotification(final String entity) {
        super(entity);
    }
}
