/*
 * This file is generated by jOOQ.
 */
package se.strindberg.jooqsimple.db.tables.records;


import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;

import se.strindberg.jooqsimple.db.tables.Address;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.5",
        "schema version:none"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AddressRecord extends TableRecordImpl<AddressRecord> implements Record3<String, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>address.line1</code>.
     */
    public void setLine1(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>address.line1</code>.
     */
    public String getLine1() {
        return (String) get(0);
    }

    /**
     * Setter for <code>address.line2</code>.
     */
    public void setLine2(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>address.line2</code>.
     */
    public String getLine2() {
        return (String) get(1);
    }

    /**
     * Setter for <code>address.person_id</code>.
     */
    public void setPersonId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>address.person_id</code>.
     */
    public Long getPersonId() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Address.ADDRESS.LINE1;
    }

    @Override
    public Field<String> field2() {
        return Address.ADDRESS.LINE2;
    }

    @Override
    public Field<Long> field3() {
        return Address.ADDRESS.PERSON_ID;
    }

    @Override
    public String component1() {
        return getLine1();
    }

    @Override
    public String component2() {
        return getLine2();
    }

    @Override
    public Long component3() {
        return getPersonId();
    }

    @Override
    public String value1() {
        return getLine1();
    }

    @Override
    public String value2() {
        return getLine2();
    }

    @Override
    public Long value3() {
        return getPersonId();
    }

    @Override
    public AddressRecord value1(String value) {
        setLine1(value);
        return this;
    }

    @Override
    public AddressRecord value2(String value) {
        setLine2(value);
        return this;
    }

    @Override
    public AddressRecord value3(Long value) {
        setPersonId(value);
        return this;
    }

    @Override
    public AddressRecord values(String value1, String value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AddressRecord
     */
    public AddressRecord() {
        super(Address.ADDRESS);
    }

    /**
     * Create a detached, initialised AddressRecord
     */
    public AddressRecord(String line1, String line2, Long personId) {
        super(Address.ADDRESS);

        setLine1(line1);
        setLine2(line2);
        setPersonId(personId);
        resetChangedOnNotNull();
    }
}