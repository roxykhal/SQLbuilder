package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_user")
public class BH_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userID;
    @Column(name = "masterUserID")
    private long masterUserID;
    @Column(name = "userTypeID")
    private long userTypeID;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "enabled")
    private String enabled;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "emailNotify")
    private String emailNotify;
    @Column(name = "timeZoneOffsetEST")
    private long timeZoneOffsetEST;
    @Column(name = "privateLabelID")
    private long privateLabelID;
    @Column(name = "isOutboundFaxEnabled")
    private long isOutboundFaxEnabled;
    @Column(name = "applicationID")
    private long applicationID;
    @Column(name = "emailSignature")
    private String emailSignature;
    @Column(name = "loginRestrictions")
    private String loginRestrictions;
    @Column(name = "inboundEmailEnabled")
    private long inboundEmailEnabled;
    @Column(name = "isDayLightSavings")
    private long isDayLightSavings;
    @Column(name = "externalID")
    private String externalID;
    @Column(name = "userUUID")
    private String userUUID;
    @Column(name = "emailDefaultText")
    private String emailDefaultText;
    @Column(name = "enableJobPostingAlerts")
    private String enableJobPostingAlerts;
    @Column(name = "migrateGUID")
    private long migrateGUID;
    @Column(name = "isLockedOut")
    private Boolean isLockedOut;
    @Column(name = "isPasswordCaseSensitive")
    private Boolean isPasswordCaseSensitive;

    public BH_User() {
    }
}
