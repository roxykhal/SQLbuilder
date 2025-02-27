package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_clientcorporation")
public class BH_ClientCorporation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientCorporationID;
    @Column(name = "departmentID")
    private long departmentID;
    @Column(name = "countryID")
    private long countryID;
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
    private long phone;
    @Column(name = "fax")
    private String fax;
    @Column(name = "companyDescription")
    private String companyDescription;
    @Column(name = "companyURL")
    private String companyURL;
    @Column(name = "jobRestrictionBits")
    private long jobRestrictionBits;
    @Column(name = "candidateRestrictionBits")
    private long candidateRestrictionBits;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "externalID")
    private String externalID;
    @Column(name = "notes")
    private String notes;
    @Column(name = "feeArrangement")
    private Double feeArrangement;
    @Column(name = "lineOfBusiness")
    private String lineOfBusiness;
    @Column(name = "ownerShip")
    private String ownerShip;
    @Column(name = "dateFounded")
    private Date dateFounded;
    @Column(name = "funding")
    private String funding;
    @Column(name = "revenue")
    private String revenue;
    @Column(name = "competitors")
    private String competitors;
    @Column(name = "numEmployees")
    private long numEmployees;
    @Column(name = "sellingPoints")
    private String sellingPoints;
    @Column(name = "culture")
    private String culture;
    @Column(name = "numOffices")
    private long numOffices;
    @Column(name = "businessSectorList")
    private String businessSectorList;
    @Column(name = "status")
    private String status;
    @Column(name = "industryList")
    private String industryList;
    @Column(name = "annualRevenue")
    private long annualRevenue;
    @Column(name = "tickerSymbol")
    private String tickerSymbol;
    @Column(name = "parentClientCorporationID")
    private long parentClientCorporationID;
    @Column(name = "billingAddress1")
    private String billingAddress1;
    @Column(name = "billingAddress2")
    private String billingAddress2;
    @Column(name = "billingCity")
    private String billingCity;
    @Column(name = "billingState")
    private long billingState;
    @Column(name = "billingZip")
    private String billingZip;
    @Column(name = "billingContact")
    private String billingContact;
    @Column(name = "billingPhone")
    private String billingPhone;
    @Column(name = "billingFrequency")
    private String billingFrequency;
    @Column(name = "workWeekStart")
    private long workWeekStart;
    @Column(name = "outstandingBalance")
    private long outstandingBalance;
    @Column(name = "migrateGUID")
    private long migrateGUID;
    @Column(name = "taxRate")
    private Double taxRate;
    @Column(name = "invoiceFormat")
    private String invoiceFormat;
    @Column(name = "trackTitle")
    private String trackTitle;
    @Column(name = "trackNumber")
    private long trackNumber;
    @Column(name = "twitterHandle")
    private String twitterHandle;
    @Column(name = "linkedinProfileName")
    private String linkedinProfileName;
    @Column(name = "facebookProfileName")
    private String facebookProfileName;
    @Column(name = "branchID")
    private long branchID;
    @Column(name = "billingCountryID")
    private long billingCountryID;
    @Column(name = "clientCorporationTaxExemptionStatusLookupID")
    private long clientCorporationTaxExemptionStatusLookupID;
    @Column(name = "dateLastModified")
    private Date dateLastModified;
    @Column(name = "timeAndLaborEnabledDate")
    private Date timeAndLaborEnabledDate;

    public BH_ClientCorporation() {
    }
}
