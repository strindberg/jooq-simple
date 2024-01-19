/*
 * This file is generated by jOOQ.
 */
package se.biobanksverige.sbr.db.enums;


import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;

import se.biobanksverige.sbr.db.Public;


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
public enum IssueType implements EnumType {

    CONSENT("CONSENT"),

    COMPLETE("COMPLETE");

    private final String literal;

    private IssueType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public String getName() {
        return "issue_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal. Returns
     * <code>null</code>, if no such value could be found, see {@link
     * EnumType#lookupLiteral(Class, String)}.
     */
    public static IssueType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(IssueType.class, literal);
    }
}