/*
 * This file is generated by jOOQ.
*/
package org.killbill.billing.plugin.tahseel.dao.gen;


import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelGatewayRequests;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelNotifications;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelPaymentMethods;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelResponses;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelGatewayRequestsRecord;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelNotificationsRecord;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelPaymentMethodsRecord;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelResponsesRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>killbill</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TahseelGatewayRequestsRecord, ULong> IDENTITY_TAHSEEL_GATEWAY_REQUESTS = Identities0.IDENTITY_TAHSEEL_GATEWAY_REQUESTS;
    public static final Identity<TahseelNotificationsRecord, ULong> IDENTITY_TAHSEEL_NOTIFICATIONS = Identities0.IDENTITY_TAHSEEL_NOTIFICATIONS;
    public static final Identity<TahseelPaymentMethodsRecord, ULong> IDENTITY_TAHSEEL_PAYMENT_METHODS = Identities0.IDENTITY_TAHSEEL_PAYMENT_METHODS;
    public static final Identity<TahseelResponsesRecord, ULong> IDENTITY_TAHSEEL_RESPONSES = Identities0.IDENTITY_TAHSEEL_RESPONSES;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TahseelGatewayRequestsRecord> KEY_TAHSEEL_GATEWAY_REQUESTS_PRIMARY = UniqueKeys0.KEY_TAHSEEL_GATEWAY_REQUESTS_PRIMARY;
    public static final UniqueKey<TahseelGatewayRequestsRecord> KEY_TAHSEEL_GATEWAY_REQUESTS_RECORD_ID = UniqueKeys0.KEY_TAHSEEL_GATEWAY_REQUESTS_RECORD_ID;
    public static final UniqueKey<TahseelGatewayRequestsRecord> KEY_TAHSEEL_GATEWAY_REQUESTS_TAHSEEL_GATEWAY_REQUESTS_TAHSEEL_BILLING_ACCOUNT = UniqueKeys0.KEY_TAHSEEL_GATEWAY_REQUESTS_TAHSEEL_GATEWAY_REQUESTS_TAHSEEL_BILLING_ACCOUNT;
    public static final UniqueKey<TahseelNotificationsRecord> KEY_TAHSEEL_NOTIFICATIONS_PRIMARY = UniqueKeys0.KEY_TAHSEEL_NOTIFICATIONS_PRIMARY;
    public static final UniqueKey<TahseelNotificationsRecord> KEY_TAHSEEL_NOTIFICATIONS_RECORD_ID = UniqueKeys0.KEY_TAHSEEL_NOTIFICATIONS_RECORD_ID;
    public static final UniqueKey<TahseelPaymentMethodsRecord> KEY_TAHSEEL_PAYMENT_METHODS_PRIMARY = UniqueKeys0.KEY_TAHSEEL_PAYMENT_METHODS_PRIMARY;
    public static final UniqueKey<TahseelPaymentMethodsRecord> KEY_TAHSEEL_PAYMENT_METHODS_RECORD_ID = UniqueKeys0.KEY_TAHSEEL_PAYMENT_METHODS_RECORD_ID;
    public static final UniqueKey<TahseelPaymentMethodsRecord> KEY_TAHSEEL_PAYMENT_METHODS_TAHSEEL_PAYMENT_METHODS_KB_PAYMENT_ID = UniqueKeys0.KEY_TAHSEEL_PAYMENT_METHODS_TAHSEEL_PAYMENT_METHODS_KB_PAYMENT_ID;
    public static final UniqueKey<TahseelResponsesRecord> KEY_TAHSEEL_RESPONSES_PRIMARY = UniqueKeys0.KEY_TAHSEEL_RESPONSES_PRIMARY;
    public static final UniqueKey<TahseelResponsesRecord> KEY_TAHSEEL_RESPONSES_RECORD_ID = UniqueKeys0.KEY_TAHSEEL_RESPONSES_RECORD_ID;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<TahseelGatewayRequestsRecord, ULong> IDENTITY_TAHSEEL_GATEWAY_REQUESTS = createIdentity(TahseelGatewayRequests.TAHSEEL_GATEWAY_REQUESTS, TahseelGatewayRequests.TAHSEEL_GATEWAY_REQUESTS.RECORD_ID);
        public static Identity<TahseelNotificationsRecord, ULong> IDENTITY_TAHSEEL_NOTIFICATIONS = createIdentity(TahseelNotifications.TAHSEEL_NOTIFICATIONS, TahseelNotifications.TAHSEEL_NOTIFICATIONS.RECORD_ID);
        public static Identity<TahseelPaymentMethodsRecord, ULong> IDENTITY_TAHSEEL_PAYMENT_METHODS = createIdentity(TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS, TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.RECORD_ID);
        public static Identity<TahseelResponsesRecord, ULong> IDENTITY_TAHSEEL_RESPONSES = createIdentity(TahseelResponses.TAHSEEL_RESPONSES, TahseelResponses.TAHSEEL_RESPONSES.RECORD_ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<TahseelGatewayRequestsRecord> KEY_TAHSEEL_GATEWAY_REQUESTS_PRIMARY = createUniqueKey(TahseelGatewayRequests.TAHSEEL_GATEWAY_REQUESTS, "KEY_tahseel_gateway_requests_PRIMARY", TahseelGatewayRequests.TAHSEEL_GATEWAY_REQUESTS.RECORD_ID);
        public static final UniqueKey<TahseelGatewayRequestsRecord> KEY_TAHSEEL_GATEWAY_REQUESTS_RECORD_ID = createUniqueKey(TahseelGatewayRequests.TAHSEEL_GATEWAY_REQUESTS, "KEY_tahseel_gateway_requests_record_id", TahseelGatewayRequests.TAHSEEL_GATEWAY_REQUESTS.RECORD_ID);
        public static final UniqueKey<TahseelGatewayRequestsRecord> KEY_TAHSEEL_GATEWAY_REQUESTS_TAHSEEL_GATEWAY_REQUESTS_TAHSEEL_BILLING_ACCOUNT = createUniqueKey(TahseelGatewayRequests.TAHSEEL_GATEWAY_REQUESTS, "KEY_tahseel_gateway_requests_tahseel_gateway_requests_tahseel_billing_account", TahseelGatewayRequests.TAHSEEL_GATEWAY_REQUESTS.TAHSEEL_BILLING_ACCOUNT);
        public static final UniqueKey<TahseelNotificationsRecord> KEY_TAHSEEL_NOTIFICATIONS_PRIMARY = createUniqueKey(TahseelNotifications.TAHSEEL_NOTIFICATIONS, "KEY_tahseel_notifications_PRIMARY", TahseelNotifications.TAHSEEL_NOTIFICATIONS.RECORD_ID);
        public static final UniqueKey<TahseelNotificationsRecord> KEY_TAHSEEL_NOTIFICATIONS_RECORD_ID = createUniqueKey(TahseelNotifications.TAHSEEL_NOTIFICATIONS, "KEY_tahseel_notifications_record_id", TahseelNotifications.TAHSEEL_NOTIFICATIONS.RECORD_ID);
        public static final UniqueKey<TahseelPaymentMethodsRecord> KEY_TAHSEEL_PAYMENT_METHODS_PRIMARY = createUniqueKey(TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS, "KEY_tahseel_payment_methods_PRIMARY", TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.RECORD_ID);
        public static final UniqueKey<TahseelPaymentMethodsRecord> KEY_TAHSEEL_PAYMENT_METHODS_RECORD_ID = createUniqueKey(TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS, "KEY_tahseel_payment_methods_record_id", TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.RECORD_ID);
        public static final UniqueKey<TahseelPaymentMethodsRecord> KEY_TAHSEEL_PAYMENT_METHODS_TAHSEEL_PAYMENT_METHODS_KB_PAYMENT_ID = createUniqueKey(TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS, "KEY_tahseel_payment_methods_tahseel_payment_methods_kb_payment_id", TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.KB_PAYMENT_METHOD_ID);
        public static final UniqueKey<TahseelResponsesRecord> KEY_TAHSEEL_RESPONSES_PRIMARY = createUniqueKey(TahseelResponses.TAHSEEL_RESPONSES, "KEY_tahseel_responses_PRIMARY", TahseelResponses.TAHSEEL_RESPONSES.RECORD_ID);
        public static final UniqueKey<TahseelResponsesRecord> KEY_TAHSEEL_RESPONSES_RECORD_ID = createUniqueKey(TahseelResponses.TAHSEEL_RESPONSES, "KEY_tahseel_responses_record_id", TahseelResponses.TAHSEEL_RESPONSES.RECORD_ID);
    }
}
