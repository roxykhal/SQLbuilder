package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_placementchangerequestedithistory")
public class BH_PlacementChangeRequestEditHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long placementChangeRequestEditHistoryID;
    @Column(name = "placementChangeRequestID")
    private long placementChangeRequestID;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "auditTrail")
    private String status;
    @Column(name = "updatingUserID")
    private long updatingUserID;
    @Column(name = "migrateGUID")
    private long migrateGUID;
    @Column(name = "transactionID")
    private long transactionID;
    @Column(name = "XPKPlacementChangeRequestEditHistory")
    private long XPKPlacementChangeRequestEditHistory;

    public BH_PlacementChangeRequestEditHistory() {
    }
}
