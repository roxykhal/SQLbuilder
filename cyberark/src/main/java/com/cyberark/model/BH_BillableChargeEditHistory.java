package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_billablechargeedithistory")
public class BH_BillableChargeEditHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long billableChargeEditHistoryID;
    @Column(name = "billableChargeID")
    private long billableChargeID;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "auditTrail")
    private String auditTrail;
    @Column(name = "updatingUserID")
    private long updatingUserID;
    @Column(name = "migrateGUID")
    private long migrateGUID;
    @Column(name = "transactionID")
    private long transactionID;
    @Column(name = "XPKBillableChargeEditHistory")
    private long XPKBillableChargeEditHistory;

    public BH_BillableChargeEditHistory() {
    }

    @Override
    public String toString() {
        return "BH_BillableChargeEditHistory{" +
                "billableChargeEditHistoryID=" + billableChargeEditHistoryID +
                ", billableChargeID=" + billableChargeID +
                ", dateAdded=" + dateAdded +
                ", auditTrail='" + auditTrail + '\'' +
                ", updatingUserID=" + updatingUserID +
                ", migrateGUID=" + migrateGUID +
                ", transactionID=" + transactionID +
                ", XPKBillableChargeEditHistory=" + XPKBillableChargeEditHistory +
                '}';
    }
}
