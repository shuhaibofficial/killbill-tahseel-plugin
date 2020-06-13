/*
 * This file is generated by jOOQ.
*/
package org.killbill.billing.plugin.tahseel.dao.gen.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelResponses;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TahseelResponsesRecord extends UpdatableRecordImpl<TahseelResponsesRecord> implements Record14<ULong, String, String, String, String, BigDecimal, String, String, String, String, String, String, Timestamp, String> {

    private static final long serialVersionUID = 1555707765;

    /**
     * Setter for <code>killbill.tahseel_responses.record_id</code>.
     */
    public void setRecordId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.record_id</code>.
     */
    public ULong getRecordId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.kb_account_id</code>.
     */
    public void setKbAccountId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.kb_account_id</code>.
     */
    public String getKbAccountId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.kb_payment_id</code>.
     */
    public void setKbPaymentId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.kb_payment_id</code>.
     */
    public String getKbPaymentId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.kb_payment_transaction_id</code>.
     */
    public void setKbPaymentTransactionId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.kb_payment_transaction_id</code>.
     */
    public String getKbPaymentTransactionId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.transaction_type</code>.
     */
    public void setTransactionType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.transaction_type</code>.
     */
    public String getTransactionType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.currency</code>.
     */
    public void setCurrency(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.currency</code>.
     */
    public String getCurrency() {
        return (String) get(6);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.tahseel_billing_account</code>.
     */
    public void setTahseelBillingAccount(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.tahseel_billing_account</code>.
     */
    public String getTahseelBillingAccount() {
        return (String) get(7);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.tahseel_rq_uid</code>.
     */
    public void setTahseelRqUid(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.tahseel_rq_uid</code>.
     */
    public String getTahseelRqUid() {
        return (String) get(8);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.status_code</code>.
     */
    public void setStatusCode(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.status_code</code>.
     */
    public String getStatusCode() {
        return (String) get(9);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.status_message</code>.
     */
    public void setStatusMessage(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.status_message</code>.
     */
    public String getStatusMessage() {
        return (String) get(10);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.additional_data</code>.
     */
    public void setAdditionalData(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.additional_data</code>.
     */
    public String getAdditionalData() {
        return (String) get(11);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.created_date</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>killbill.tahseel_responses.kb_tenant_id</code>.
     */
    public void setKbTenantId(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>killbill.tahseel_responses.kb_tenant_id</code>.
     */
    public String getKbTenantId() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<ULong, String, String, String, String, BigDecimal, String, String, String, String, String, String, Timestamp, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<ULong, String, String, String, String, BigDecimal, String, String, String, String, String, String, Timestamp, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TahseelResponses.TAHSEEL_RESPONSES.RECORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TahseelResponses.TAHSEEL_RESPONSES.KB_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TahseelResponses.TAHSEEL_RESPONSES.KB_PAYMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TahseelResponses.TAHSEEL_RESPONSES.KB_PAYMENT_TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TahseelResponses.TAHSEEL_RESPONSES.TRANSACTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TahseelResponses.TAHSEEL_RESPONSES.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TahseelResponses.TAHSEEL_RESPONSES.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TahseelResponses.TAHSEEL_RESPONSES.TAHSEEL_BILLING_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TahseelResponses.TAHSEEL_RESPONSES.TAHSEEL_RQ_UID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TahseelResponses.TAHSEEL_RESPONSES.STATUS_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return TahseelResponses.TAHSEEL_RESPONSES.STATUS_MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TahseelResponses.TAHSEEL_RESPONSES.ADDITIONAL_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return TahseelResponses.TAHSEEL_RESPONSES.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TahseelResponses.TAHSEEL_RESPONSES.KB_TENANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getRecordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getKbAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getKbPaymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getKbPaymentTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTransactionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTahseelBillingAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTahseelRqUid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getStatusCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getStatusMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAdditionalData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getKbTenantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value1(ULong value) {
        setRecordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value2(String value) {
        setKbAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value3(String value) {
        setKbPaymentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value4(String value) {
        setKbPaymentTransactionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value5(String value) {
        setTransactionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value6(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value7(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value8(String value) {
        setTahseelBillingAccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value9(String value) {
        setTahseelRqUid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value10(String value) {
        setStatusCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value11(String value) {
        setStatusMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value12(String value) {
        setAdditionalData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value13(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord value14(String value) {
        setKbTenantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelResponsesRecord values(ULong value1, String value2, String value3, String value4, String value5, BigDecimal value6, String value7, String value8, String value9, String value10, String value11, String value12, Timestamp value13, String value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TahseelResponsesRecord
     */
    public TahseelResponsesRecord() {
        super(TahseelResponses.TAHSEEL_RESPONSES);
    }

    /**
     * Create a detached, initialised TahseelResponsesRecord
     */
    public TahseelResponsesRecord(ULong recordId, String kbAccountId, String kbPaymentId, String kbPaymentTransactionId, String transactionType, BigDecimal amount, String currency, String tahseelBillingAccount, String tahseelRqUid, String statusCode, String statusMessage, String additionalData, Timestamp createdDate, String kbTenantId) {
        super(TahseelResponses.TAHSEEL_RESPONSES);

        set(0, recordId);
        set(1, kbAccountId);
        set(2, kbPaymentId);
        set(3, kbPaymentTransactionId);
        set(4, transactionType);
        set(5, amount);
        set(6, currency);
        set(7, tahseelBillingAccount);
        set(8, tahseelRqUid);
        set(9, statusCode);
        set(10, statusMessage);
        set(11, additionalData);
        set(12, createdDate);
        set(13, kbTenantId);
    }
}