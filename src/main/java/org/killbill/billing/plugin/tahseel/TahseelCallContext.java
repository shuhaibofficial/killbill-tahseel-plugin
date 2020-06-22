package org.killbill.billing.plugin.tahseel;

import org.joda.time.DateTime;
import org.killbill.billing.plugin.api.PluginCallContext;

import java.util.UUID;

public class TahseelCallContext extends PluginCallContext {

    private static final String TAHSEEL_PLUGIN = "Tahseel plugin";

    public TahseelCallContext(final DateTime utcNow, final UUID accountId, final UUID tenantId) {
        super(TAHSEEL_PLUGIN, utcNow, accountId, tenantId);
    }
}
