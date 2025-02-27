package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_clienthistory")
public class BH_ClientHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientHistoryID;
    @Column(name = "clientID")
    private long clientID;
    @Column(name = "userID")
    private long userID;
    @Column(name = "status")
    private String status;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "comments")
    private String comments;
    @Column(name = "migrateGUID")
    private long migrateGUID;
    @Column(name = "clientUserID")
    private long clientUserID;

    public BH_ClientHistory() {
    }
}
