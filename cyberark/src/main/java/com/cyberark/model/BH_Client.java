package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_client")
public class BH_Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientID;
    @Column(name = "userID")
    private long userID;
    @Column(name = "clientCorporationID")
    private long clientCorporationID;
    @Column(name = "recruiterUserID")
    private long recruiterUserID;
    @Column(name = "office")
    private String office;
    @Column(name = "division")
    private String division;
    @Column(name = "type")
    private String type;
    @Column(name = "preferredContact")
    private String preferredContact;
    @Column(name = "status")
    private String status;
    @Column(name = "candidateRestrictionBits")
    private long candidateRestrictionBits;
    @Column(name = "jobRestrictionBits")
    private long jobRestrictionBits;
    @Column(name = "comments")
    private String comments;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "delete_me")
    private String delete_me;
    @Column(name = "isDeleted")
    private long isDeleted;
    @Column(name = "isPrimaryOwner")
    private long isPrimaryOwner;
    @Column(name = "desiredCategories")
    private String desiredCategories;
    @Column(name = "desiredSkills")
    private String desiredSkills;
    @Column(name = "dateLastVisit")
    private Date dateLastVisit;
    @Column(name = "externalID")
    private String externalID;
    @Column(name = "numOwners")
    private long numOwners;
    @Column(name = "desiredSpecialties")
    private String desiredSpecialties;
    @Column(name = "migrateGUID")
    private long migrateGUID;
    @Column(name = "trackTitle")
    private String trackTitle;
    @Column(name = "trackNumber")
    private long trackNumber;
    @Column(name = "isDefaultContact")
    private Boolean isDefaultContact;
    @Column(name = "XPKClient")
    private long XPKClient;

    public BH_Client() {
    }
}
