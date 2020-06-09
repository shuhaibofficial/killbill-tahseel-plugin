/*
 * This file is generated by jOOQ.
 */
package org.killbill.billing.plugin.tahseel.dao.gen;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelGatewayRequests;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelPaymentMethods;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelResponses;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Killbill extends SchemaImpl {

    private static final long serialVersionUID = 71218374;

    /**
     * The reference instance of <code>killbill</code>
     */
    public static final Killbill KILLBILL = new Killbill();

    /**
     * The table <code>killbill.tahseel_gateway_requests</code>.
     */
    public final TahseelGatewayRequests TAHSEEL_GATEWAY_REQUESTS = TahseelGatewayRequests.TAHSEEL_GATEWAY_REQUESTS;

    /**
     * The table <code>killbill.tahseel_payment_methods</code>.
     */
    public final TahseelPaymentMethods TAHSEEL_PAYMENT_METHODS = TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS;

    /**
     * The table <code>killbill.tahseel_responses</code>.
     */
    public final TahseelResponses TAHSEEL_RESPONSES = TahseelResponses.TAHSEEL_RESPONSES;

    /**
     * No further instances allowed
     */
    private Killbill() {
        super("killbill", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            TahseelGatewayRequests.TAHSEEL_GATEWAY_REQUESTS,
            TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS,
            TahseelResponses.TAHSEEL_RESPONSES);
    }
}
