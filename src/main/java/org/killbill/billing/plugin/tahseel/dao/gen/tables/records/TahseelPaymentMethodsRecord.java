/*
 * This file is generated by jOOQ.
*/
package org.killbill.billing.plugin.tahseel.dao.gen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.tahseel.dao.gen.tables.TahseelPaymentMethods;


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
public class TahseelPaymentMethodsRecord extends UpdatableRecordImpl<TahseelPaymentMethodsRecord> implements Record10<ULong, String, String, String, Short, Short, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = -2147050953;

    /**
     * Setter for <code>killbill.tahseel_payment_methods.record_id</code>.
     */
    public void setRecordId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>killbill.tahseel_payment_methods.record_id</code>.
     */
    public ULong getRecordId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>killbill.tahseel_payment_methods.kb_account_id</code>.
     */
    public void setKbAccountId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>killbill.tahseel_payment_methods.kb_account_id</code>.
     */
    public String getKbAccountId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>killbill.tahseel_payment_methods.kb_payment_method_id</code>.
     */
    public void setKbPaymentMethodId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>killbill.tahseel_payment_methods.kb_payment_method_id</code>.
     */
    public String getKbPaymentMethodId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>killbill.tahseel_payment_methods.tahseel_id</code>.
     */
    public void setTahseelId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>killbill.tahseel_payment_methods.tahseel_id</code>.
     */
    public String getTahseelId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>killbill.tahseel_payment_methods.is_default</code>.
     */
    public void setIsDefault(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>killbill.tahseel_payment_methods.is_default</code>.
     */
    public Short getIsDefault() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>killbill.tahseel_payment_methods.is_deleted</code>.
     */
    public void setIsDeleted(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>killbill.tahseel_payment_methods.is_deleted</code>.
     */
    public Short getIsDeleted() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>killbill.tahseel_payment_methods.additional_data</code>.
     */
    public void setAdditionalData(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>killbill.tahseel_payment_methods.additional_data</code>.
     */
    public String getAdditionalData() {
        return (String) get(6);
    }

    /**
     * Setter for <code>killbill.tahseel_payment_methods.created_date</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>killbill.tahseel_payment_methods.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>killbill.tahseel_payment_methods.updated_date</code>.
     */
    public void setUpdatedDate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>killbill.tahseel_payment_methods.updated_date</code>.
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>killbill.tahseel_payment_methods.kb_tenant_id</code>.
     */
    public void setKbTenantId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>killbill.tahseel_payment_methods.kb_tenant_id</code>.
     */
    public String getKbTenantId() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, String, String, String, Short, Short, String, Timestamp, Timestamp, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, String, String, String, Short, Short, String, Timestamp, Timestamp, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.RECORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.KB_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.KB_PAYMENT_METHOD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.TAHSEEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.IS_DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.IS_DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.ADDITIONAL_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.UPDATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS.KB_TENANT_ID;
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
        return getKbPaymentMethodId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTahseelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getIsDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getIsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAdditionalData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getKbTenantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelPaymentMethodsRecord value1(ULong value) {
        setRecordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelPaymentMethodsRecord value2(String value) {
        setKbAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelPaymentMethodsRecord value3(String value) {
        setKbPaymentMethodId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelPaymentMethodsRecord value4(String value) {
        setTahseelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelPaymentMethodsRecord value5(Short value) {
        setIsDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelPaymentMethodsRecord value6(Short value) {
        setIsDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelPaymentMethodsRecord value7(String value) {
        setAdditionalData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelPaymentMethodsRecord value8(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelPaymentMethodsRecord value9(Timestamp value) {
        setUpdatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelPaymentMethodsRecord value10(String value) {
        setKbTenantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TahseelPaymentMethodsRecord values(ULong value1, String value2, String value3, String value4, Short value5, Short value6, String value7, Timestamp value8, Timestamp value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TahseelPaymentMethodsRecord
     */
    public TahseelPaymentMethodsRecord() {
        super(TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS);
    }

    /**
     * Create a detached, initialised TahseelPaymentMethodsRecord
     */
    public TahseelPaymentMethodsRecord(ULong recordId, String kbAccountId, String kbPaymentMethodId, String tahseelId, Short isDefault, Short isDeleted, String additionalData, Timestamp createdDate, Timestamp updatedDate, String kbTenantId) {
        super(TahseelPaymentMethods.TAHSEEL_PAYMENT_METHODS);

        set(0, recordId);
        set(1, kbAccountId);
        set(2, kbPaymentMethodId);
        set(3, tahseelId);
        set(4, isDefault);
        set(5, isDeleted);
        set(6, additionalData);
        set(7, createdDate);
        set(8, updatedDate);
        set(9, kbTenantId);
    }
}
