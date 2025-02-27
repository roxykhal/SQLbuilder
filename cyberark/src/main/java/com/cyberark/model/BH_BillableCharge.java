package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_billablecharge")
public class BH_BillableCharge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long billableChargeID;
    @Column(name = "placementID")
    private long placementID;
    @Column(name = "billingProfileID")
    private long billingProfileID;
    @Column(name = "periodEndDate")
    private Date periodEndDate;
    @Column(name = "readyToBillOverride")
    private Boolean readyToBillOverride;
    @Column(name = "description")
    private String description;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "dateLastModified")
    private Date dateLastModified;
    @Column(name = "generalLedgerSegment1ID")
    private long generalLedgerSegment1ID;
    @Column(name = "generalLedgerSegment2ID")
    private long generalLedgerSegment2ID;
    @Column(name = "generalLedgerSegment3ID")
    private long generalLedgerSegment3ID;
    @Column(name = "generalLedgerSegment4ID")
    private long generalLedgerSegment4ID;
    @Column(name = "generalLedgerSegment5ID")
    private long generalLedgerSegment5ID;
    @Column(name = "addedByUserID")
    private long addedByUserID;
    @Column(name = "generalLedgerServiceCodeID")
    private long generalLedgerServiceCodeID;
    @Column(name = "entryTypeLookupID")
    private long entryTypeLookupID;
    @Column(name = "externalID")
    private String externalID;
    @Column(name = "timesheetID")
    private long timesheetID;
    @Column(name = "expenseSheetID")
    private long expenseSheetID;

    public BH_BillableCharge() {
    }

    @Override
    public String toString() {
        return "BH_BillableCharge{" +
                "billableChargeID=" + billableChargeID +
                ", placementID=" + placementID +
                ", billingProfileID=" + billingProfileID +
                ", periodEndDate=" + periodEndDate +
                ", readyToBillOverride=" + readyToBillOverride +
                ", description='" + description + '\'' +
                ", dateAdded=" + dateAdded +
                ", dateLastModified=" + dateLastModified +
                ", generalLedgerSegment1ID=" + generalLedgerSegment1ID +
                ", generalLedgerSegment2ID=" + generalLedgerSegment2ID +
                ", generalLedgerSegment3ID=" + generalLedgerSegment3ID +
                ", generalLedgerSegment4ID=" + generalLedgerSegment4ID +
                ", generalLedgerSegment5ID=" + generalLedgerSegment5ID +
                ", addedByUserID=" + addedByUserID +
                ", generalLedgerServiceCodeID=" + generalLedgerServiceCodeID +
                ", entryTypeLookupID=" + entryTypeLookupID +
                ", externalID='" + externalID + '\'' +
                ", timesheetID=" + timesheetID +
                ", expenseSheetID=" + expenseSheetID +
                '}';
    }
}
