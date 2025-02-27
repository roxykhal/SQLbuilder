package com.cyberark.model;

import javax.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="bh_candidate")
public class BH_Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long candidateId;
    @Column(name = "userID")
    private long userID;
    @Column(name = "recruiterUserID")
    private long recruiterUserID;
    @Column(name = "type")
    private String type;
    @Column(name = "preferredContact")
    private String preferredContact;
    @Column(name = "status")
    private String status;
    @Column(name = "isEditable")
    private Boolean isEditable;
    @Column(name = "clientRestrictionBits")
    private long clientRestrictionBits;
    @Column(name = "comments")
    private String comments;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "dateNextCall")
    private Date dateNextCall;
    @Column(name = "candidateSourceID")
    private long candidateSourceID;
    @Column(name = "isDeleted")
    private Boolean isDeleted;
    @Column(name = "employeeType")
    private String employeeType;
    @Column(name = "isPrimaryOwner")
    private long isPrimaryOwner;
    @Column(name = "externalID")
    private String externalID;
    @Column(name = "numOwners")
    private long numOwners;
    @Column(name = "migrateGUID")
    private long migrateGUID;
    @Column(name = "travelMethod")
    private String travelMethod;
    @Column(name = "canEnterTime")
    private Boolean canEnterTime;
    @Column(name = "isOnboardingReadyToStart")
    private String isOnboardingReadyToStart;
    @Column(name = "maritalStatus")
    private String maritalStatus;
    @Column(name = "payrollClientStartDate")
    private Date payrollClientStartDate;
    @Column(name = "payrollStatus")
    private String payrollStatus;
    @Column(name = "onboardingStatus")
    private String onboardingStatus;
    @Column(name = "onboardingPercentComplete")
    private long onboardingPercentComplete;
    @Column(name = "onboardingDocumentSentCount")
    private long onboardingDocumentSentCount;
    @Column(name = "onboardingDocumentReceivedCount")
    private long onboardingDocumentReceivedCount;
    @Column(name = "estaffGUID")
    private long estaffGUID;
    @Column(name = "dateLastPayrollProviderSync")
    private Date dateLastPayrollProviderSync;
    @Column(name = "clientRating")
    private long clientRating;

    public BH_Candidate() {
    }

    @Override
    public String toString() {
        return "BH_Candidate{" +
                "candidateId=" + candidateId +
                ", userId=" + userID +
                ", recruiterUserID=" + recruiterUserID +
                ", type='" + type + '\'' +
                ", preferredContact='" + preferredContact + '\'' +
                ", status='" + status + '\'' +
                ", isEditable=" + isEditable +
                ", clientRestrictionBits=" + clientRestrictionBits +
                ", comments='" + comments + '\'' +
                ", dateAdded=" + dateAdded +
                ", dateNextCall=" + dateNextCall +
                ", candidateSourceID=" + candidateSourceID +
                ", isDeleted=" + isDeleted +
                ", employeeType='" + employeeType + '\'' +
                ", isPrimaryOwner=" + isPrimaryOwner +
                ", externalID='" + externalID + '\'' +
                ", numOwners=" + numOwners +
                ", migrateGUID=" + migrateGUID +
                ", travelMethod='" + travelMethod + '\'' +
                ", canEnterTime=" + canEnterTime +
                ", isOnboardingReadyToStart='" + isOnboardingReadyToStart + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", payrollClientStartDate=" + payrollClientStartDate +
                ", payrollStatus='" + payrollStatus + '\'' +
                ", onboardingStatus='" + onboardingStatus + '\'' +
                ", onboardingPercentComplete=" + onboardingPercentComplete +
                ", onboardingDocumentSentCount=" + onboardingDocumentSentCount +
                ", onboardingDocumentReceivedCount=" + onboardingDocumentReceivedCount +
                ", estaffGUID=" + estaffGUID +
                ", dateLastPayrollProviderSync=" + dateLastPayrollProviderSync +
                ", clientRating=" + clientRating +
                '}';
    }
}
