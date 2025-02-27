package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_candidatesource")
public class BH_CandidateSource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long candidateSourceID;
    @Column(name = "userID")
    private long userID;
    @Column(name = "corporationID")
    private long corporationID;
    @Column(name = "name")
    private String name;
    @Column(name = "address1")
    private String address1;
    @Column(name = "address2")
    private String address2;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private String zip;
    @Column(name = "phone")
    private String phone;
    @Column(name = "fax")
    private String fax;
    @Column(name = "accountNumber")
    private String accountNumber;
    @Column(name = "feeType")
    private String feeType;
    @Column(name = "fee")
    private long fee;
    @Column(name = "type")
    private String type;
    @Column(name = "migrateGUID")
    private long migrateGUID;

    public BH_CandidateSource() {
    }
}
