/*
 * This file is generated by jOOQ.
 */
package se.biobanksverige.sbr.db.tables.records;


import javax.annotation.processing.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import se.biobanksverige.sbr.db.enums.IssueType;
import se.biobanksverige.sbr.db.tables.IssueConsent;


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
public class IssueConsentRecord extends UpdatableRecordImpl<IssueConsentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.issue_consent.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.issue_consent.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.issue_consent.type</code>.
     */
    public void setType(IssueType value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.issue_consent.type</code>.
     */
    public IssueType getType() {
        return (IssueType) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IssueConsentRecord
     */
    public IssueConsentRecord() {
        super(IssueConsent.ISSUE_CONSENT);
    }

    /**
     * Create a detached, initialised IssueConsentRecord
     */
    public IssueConsentRecord(Long id, IssueType type) {
        super(IssueConsent.ISSUE_CONSENT);

        setId(id);
        setType(type);
        resetChangedOnNotNull();
    }
}