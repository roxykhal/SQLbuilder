package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_useredithistory")
public class BH_UserEditHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userEditHistoryID;
    @Column(name = "userID")
    private long userID;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "auditTrail")
    private String auditTrail;
    @Column(name = "comments")
    private String comments;
    @Column(name = "updatingUserID")
    private long updatingUserID;
    @Column(name = "migrateGUID")
    private long migrateGUID;
    @Column(name = "transactionID")
    private long transactionID;

    public BH_UserEditHistory() {
    }
}
