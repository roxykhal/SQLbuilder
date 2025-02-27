package com.cyberark.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_appointmentedithistory")
public class BH_AppointedHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long appointmentEditHistoryID;
    @Column(name = "appointmentID")
    private long appointmentID;
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

    public BH_AppointedHistory() {
    }

    @Override
    public String toString() {
        return "BH_AppointedHistory{" +
                "appointmentEditHistoryID=" + appointmentEditHistoryID +
                ", appointmentID=" + appointmentID +
                ", dateAdded=" + dateAdded +
                ", auditTrail='" + auditTrail + '\'' +
                ", updatingUserID=" + updatingUserID +
                ", migrateGUID=" + migrateGUID +
                ", transactionID=" + transactionID +
                '}';
    }
}
