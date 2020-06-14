/*
 * Copyright 2014-2019 The Billing Project, LLC
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

package org.killbill.billing.plugin.tahseel.dao;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Nullable;
import javax.sql.DataSource;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.joda.time.DateTime;
import org.jooq.impl.DSL;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.payment.api.PluginProperty;
import org.killbill.billing.payment.api.TransactionType;
import org.killbill.billing.plugin.api.PluginProperties;
import org.killbill.billing.plugin.dao.payment.PluginPaymentDao;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.common.collect.ImmutableMap;

import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelPaymentMethods;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelResponses;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelGatewayRequestsRecord;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelPaymentMethodsRecord;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.records.TahseelResponsesRecord;


import static org.killbill.billing.plugin.tahseel.dao.gen.Tables.*;
import static org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS;
import static org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelResponses.TAHSEEL_RESPONSES;

public class TahseelDao extends PluginPaymentDao<TahseelResponsesRecord, TahseelResponses, TahseelPaymentMethodsRecord, TahseelPaymentMethods> {



    private static final ObjectMapper objectMapper = new ObjectMapper();

    public TahseelDao(final DataSource dataSource) throws SQLException {
        super(TAHSEEL_RESPONSES, TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS, dataSource);
        // Save space in the database
        objectMapper.setSerializationInclusion(Include.NON_EMPTY);
    }

    // Payment methods
    public void addPaymentMethod(final UUID kbAccountId,
                                 final UUID  kbPaymentMethodId,
                                 final Map<String, Object> additionalDataMap,
                                 final String tahseelId,
                                 final DateTime utcNow,
                                 final UUID kbTenantId) throws SQLException {
        execute(dataSource.getConnection(),
                new WithConnectionCallback<TahseelResponsesRecord>() {
                    @Override
                    public TahseelResponsesRecord withConnection(final Connection conn) throws SQLException {
                        DSL.using(conn, dialect, settings)
                           .insertInto(TAHSEEL_PAYMENT_METHODS,
                                   TAHSEEL_PAYMENT_METHODS.KB_ACCOUNT_ID,
                                   TAHSEEL_PAYMENT_METHODS.KB_PAYMENT_METHOD_ID,
                                   TAHSEEL_PAYMENT_METHODS.TAHSEEL_ID,
                                   TAHSEEL_PAYMENT_METHODS.IS_DELETED,
                                   TAHSEEL_PAYMENT_METHODS.ADDITIONAL_DATA,
                                   TAHSEEL_PAYMENT_METHODS.CREATED_DATE,
                                   TAHSEEL_PAYMENT_METHODS.UPDATED_DATE,
                                   TAHSEEL_PAYMENT_METHODS.KB_TENANT_ID)
                           .values(kbAccountId.toString(),
                                   kbPaymentMethodId.toString(),
                                   tahseelId,
                                   (short) FALSE,
                                   asString(additionalDataMap),
                                   toTimestamp(utcNow),
                                   toTimestamp(utcNow),
                                   kbTenantId.toString()
                                   )
                           .execute();

                        return null;
                    }
                });
    }

    public void updatePaymentMethod(final UUID kbPaymentMethodId,
                                    final Map<String, Object> additionalDataMap,
                                    final String tahseelId,
                                    final DateTime utcNow,
                                    final UUID kbTenantId) throws SQLException {
        execute(dataSource.getConnection(),
                new WithConnectionCallback<TahseelResponsesRecord>() {
                    @Override
                    public TahseelResponsesRecord withConnection(final Connection conn) throws SQLException {
                        DSL.using(conn, dialect, settings)
                           .update(TAHSEEL_PAYMENT_METHODS)
                           .set(TAHSEEL_PAYMENT_METHODS.ADDITIONAL_DATA, asString(additionalDataMap))
                           .set(TAHSEEL_PAYMENT_METHODS.UPDATED_DATE, toTimestamp(utcNow))
                           .where(TAHSEEL_PAYMENT_METHODS.KB_PAYMENT_METHOD_ID.equal(kbPaymentMethodId.toString()))
                           .and(TAHSEEL_PAYMENT_METHODS.TAHSEEL_ID.equal(tahseelId))
                           .and(TAHSEEL_PAYMENT_METHODS.KB_TENANT_ID.equal(kbTenantId.toString()))
                           .execute();
                        return null;
                    }
                });
    }

    // HPP requests
    public void addGatewayRequest(final UUID kbAccountId,
                                           final UUID kbPaymentId,
                                           final UUID kbPaymentTransactionId,
                                           final String billing_account,
                                           final String tahseel_rq_uid,
                                           final DateTime utcNow,
                                           final UUID kbTenantId) throws SQLException {
        final Map<String, Object> additionalDataMap = new HashMap<>();

        execute(dataSource.getConnection(),
                new WithConnectionCallback<Void>() {
                    @Override
                    public Void withConnection(final Connection conn) throws SQLException {
                        DSL.using(conn, dialect, settings)
                                .insertInto(TAHSEEL_GATEWAY_REQUESTS,
                                        TAHSEEL_GATEWAY_REQUESTS.KB_ACCOUNT_ID,
                                        TAHSEEL_GATEWAY_REQUESTS.KB_PAYMENT_ID,
                                        TAHSEEL_GATEWAY_REQUESTS.KB_PAYMENT_TRANSACTION_ID,
                                        TAHSEEL_GATEWAY_REQUESTS.TAHSEEL_BILLING_ACCOUNT,
                                        TAHSEEL_GATEWAY_REQUESTS.TAHSEEL_RQ_UID,
                                        TAHSEEL_GATEWAY_REQUESTS.ADDITIONAL_DATA,
                                        TAHSEEL_GATEWAY_REQUESTS.CREATED_DATE,
                                        TAHSEEL_GATEWAY_REQUESTS.KB_TENANT_ID)
                                .values(kbAccountId.toString(),
                                        kbPaymentId == null ? null : kbPaymentId.toString(),
                                        kbPaymentTransactionId == null ? null : kbPaymentTransactionId.toString(),
                                        billing_account,
                                        tahseel_rq_uid,
                                        asString(additionalDataMap),
                                        toTimestamp(utcNow),
                                        kbTenantId.toString())
                                .execute();
                        return null;
                    }
                });
    }
    public TahseelResponsesRecord addResponse(final UUID kbAccountId,
                                             final UUID kbPaymentId,
                                             final UUID kbPaymentTransactionId,
                                             final TransactionType transactionType,
                                             final BigDecimal amount,
                                             final Currency currency,
                                             final String tahseel_billing_account,
                                             final String tahseel_rq_uid,
                                             final String status_code,
                                              final String status_message,
                                             final DateTime utcNow,
                                             final UUID kbTenantId) throws SQLException {
        final Map<String, Object> additionalDataMap = new HashMap<>();//StripePluginProperties.toAdditionalDataMap(stripePaymentIntent);

        return execute(dataSource.getConnection(),
                new WithConnectionCallback<TahseelResponsesRecord>() {
                    @Override
                    public TahseelResponsesRecord withConnection(final Connection conn) throws SQLException {
                        return DSL.using(conn, dialect, settings)
                                .insertInto(TAHSEEL_RESPONSES,
                                        TAHSEEL_RESPONSES.KB_ACCOUNT_ID,
                                        TAHSEEL_RESPONSES.KB_PAYMENT_ID,
                                        TAHSEEL_RESPONSES.KB_PAYMENT_TRANSACTION_ID,
                                        TAHSEEL_RESPONSES.TRANSACTION_TYPE,
                                        TAHSEEL_RESPONSES.AMOUNT,
                                        TAHSEEL_RESPONSES.CURRENCY,
                                        TAHSEEL_RESPONSES.TAHSEEL_BILLING_ACCOUNT,
                                        TAHSEEL_RESPONSES.TAHSEEL_RQ_UID,
                                        TAHSEEL_RESPONSES.STATUS_CODE,
                                        TAHSEEL_RESPONSES.STATUS_MESSAGE,
                                        TAHSEEL_RESPONSES.ADDITIONAL_DATA,
                                        TAHSEEL_RESPONSES.CREATED_DATE,
                                        TAHSEEL_RESPONSES.KB_TENANT_ID)
                                .values(kbAccountId.toString(),
                                        kbPaymentId.toString(),
                                        kbPaymentTransactionId.toString(),
                                        transactionType.toString(),
                                        amount,
                                        currency == null ? null : currency.name(),
                                        tahseel_billing_account,
                                        tahseel_rq_uid,
                                        status_code,
                                        status_message,
                                        asString(additionalDataMap),
                                        toTimestamp(utcNow),
                                        kbTenantId.toString())
                                .returning()
                                .fetchOne();
                    }
                });
    }



    public static Map fromAdditionalData(@Nullable final String additionalData) {
        if (additionalData == null) {
            return ImmutableMap.of();
        }

        try {
            return objectMapper.readValue(additionalData, Map.class);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }
}
