package com.cyberark.model;

import javax.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="bh_activity")
public class BH_Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long activityID;
    @Column(name = "userID")
    private long userId;
    @Column(name = "clientCorporationID")
    private long clientCorporationID;
    @Column(name = "activityDate")
    private Date activityDate;
    @Column(name = "recordID")
    private long recordID;
    @Column(name = "isDeleted")
    private Boolean isDeleted;
    @Column(name = "job")
    private long job;
    @Column(name = "clientContact")
    private long clientContact;
    @Column(name = "clientVisit")
    private long clientVisit;
    @Column(name = "candidate")
    private long candidate;
    @Column(name = "recruitingSubmission")
    private long recruitingSubmission;
    @Column(name = "salesSubmission")
    private long salesSubmission;
    @Column(name = "recruitingSendout")
    private long recruitingSendout;
    @Column(name = "salesSendout")
    private long salesSendout;
    @Column(name = "recruitingInterview")
    private long recruitingInterview;
    @Column(name = "salesInterview")
    private long salesInterview;
    @Column(name = "recruitingPlacement")
    private long recruitingPlacement;
    @Column(name = "salesPlacement")
    private long salesPlacement;
    @Column(name = "numOpenings")
    private long numOpenings;
    @Column(name = "recruitingPlacementStart")
    private long recruitingPlacementStart;
    @Column(name = "salesPlacementStart")
    private long salesPlacementStart;
    @Column(name = "recruitingInterviewDate")
    private long recruitingInterviewDate;
    @Column(name = "salesInterviewDate")
    private long salesInterviewDate;

    public BH_Activity() {
    }

    @Override
    public String toString() {
        return "BH_Activity{" +
                "activityID=" + activityID +
                ", userId=" + userId +
                ", clientCorporationID=" + clientCorporationID +
                ", activityDate=" + activityDate +
                ", recordID=" + recordID +
                ", isDeleted=" + isDeleted +
                ", job=" + job +
                ", clientContact=" + clientContact +
                ", clientVisit=" + clientVisit +
                ", candidate=" + candidate +
                ", recruitingSubmission=" + recruitingSubmission +
                ", salesSubmission=" + salesSubmission +
                ", recruitingSendout=" + recruitingSendout +
                ", salesSendout=" + salesSendout +
                ", recruitingInterview=" + recruitingInterview +
                ", salesInterview=" + salesInterview +
                ", recruitingPlacement=" + recruitingPlacement +
                ", salesPlacement=" + salesPlacement +
                ", numOpenings=" + numOpenings +
                ", recruitingPlacementStart=" + recruitingPlacementStart +
                ", salesPlacementStart=" + salesPlacementStart +
                ", recruitingInterviewDate=" + recruitingInterviewDate +
                ", salesInterviewDate=" + salesInterviewDate +
                '}';
    }
}
