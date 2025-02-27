package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_candidatehistory")
public class BH_CandidateHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long candidateHistoryID;
    @Column(name = "candidateID")
    private long candidateID;
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
    @Column(name = "candidateUserID")
    private long candidateUserID;

    public BH_CandidateHistory() {
    }
}
