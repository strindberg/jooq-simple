/*
 * This file is generated by jOOQ.
 */
package se.strindberg.jooqsimple.db.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import se.strindberg.jooqsimple.db.DefaultSchema;
import se.strindberg.jooqsimple.db.Keys;
import se.strindberg.jooqsimple.db.tables.Person.PersonPath;
import se.strindberg.jooqsimple.db.tables.records.AddressRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.19.2",
        "schema version:none"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Address extends TableImpl<AddressRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>address</code>
     */
    public static final Address ADDRESS = new Address();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AddressRecord> getRecordType() {
        return AddressRecord.class;
    }

    /**
     * The column <code>address.line1</code>.
     */
    public final TableField<AddressRecord, String> LINE1 = createField(DSL.name("line1"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>address.line2</code>.
     */
    public final TableField<AddressRecord, String> LINE2 = createField(DSL.name("line2"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>address.person_id</code>.
     */
    public final TableField<AddressRecord, Long> PERSON_ID = createField(DSL.name("person_id"), SQLDataType.BIGINT, this, "");

    private Address(Name alias, Table<AddressRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Address(Name alias, Table<AddressRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>address</code> table reference
     */
    public Address(String alias) {
        this(DSL.name(alias), ADDRESS);
    }

    /**
     * Create an aliased <code>address</code> table reference
     */
    public Address(Name alias) {
        this(alias, ADDRESS);
    }

    /**
     * Create a <code>address</code> table reference
     */
    public Address() {
        this(DSL.name("address"), null);
    }

    public <O extends Record> Address(Table<O> path, ForeignKey<O, AddressRecord> childPath, InverseForeignKey<O, AddressRecord> parentPath) {
        super(path, childPath, parentPath, ADDRESS);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class AddressPath extends Address implements Path<AddressRecord> {
        public <O extends Record> AddressPath(Table<O> path, ForeignKey<O, AddressRecord> childPath, InverseForeignKey<O, AddressRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private AddressPath(Name alias, Table<AddressRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public AddressPath as(String alias) {
            return new AddressPath(DSL.name(alias), this);
        }

        @Override
        public AddressPath as(Name alias) {
            return new AddressPath(alias, this);
        }

        @Override
        public AddressPath as(Table<?> alias) {
            return new AddressPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<ForeignKey<AddressRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CONSTRAINT_B);
    }

    private transient PersonPath _person;

    /**
     * Get the implicit join path to the <code>PUBLIC.person</code> table.
     */
    public PersonPath person() {
        if (_person == null)
            _person = new PersonPath(this, Keys.CONSTRAINT_B, null);

        return _person;
    }

    @Override
    public Address as(String alias) {
        return new Address(DSL.name(alias), this);
    }

    @Override
    public Address as(Name alias) {
        return new Address(alias, this);
    }

    @Override
    public Address as(Table<?> alias) {
        return new Address(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(String name) {
        return new Address(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(Name name) {
        return new Address(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Address rename(Table<?> name) {
        return new Address(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Address where(Condition condition) {
        return new Address(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Address where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Address where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Address where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Address where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Address where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Address where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Address where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Address whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Address whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
