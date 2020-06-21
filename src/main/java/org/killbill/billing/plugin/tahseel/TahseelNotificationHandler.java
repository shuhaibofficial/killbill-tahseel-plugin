package org.killbill.billing.plugin.tahseel;

import org.killbill.billing.osgi.libs.killbill.OSGIKillbillAPI;
import org.killbill.billing.plugin.tahseel.dao.TahseelDao;

import org.killbill.clock.Clock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
}
