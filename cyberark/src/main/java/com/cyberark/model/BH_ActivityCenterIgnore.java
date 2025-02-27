package com.cyberark.model;

import javax.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="bh_activitycenterignore")
public class BH_ActivityCenterIgnore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ignoreID;
    @Column(name = "userID")
    private long userId;
    @Column(name = "contactID")
    private long contactID;
    @Column(name = "email")
    private String email;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "emailName")
    private String emailName;

    @Override
    public String toString() {
        return "BH_ActivityCenterIgnore{" +
                "ignoreID=" + ignoreID +
                ", userId=" + userId +
                ", contactID=" + contactID +
                ", email='" + email + '\'' +
                ", dateAdded=" + dateAdded +
                ", emailName='" + emailName + '\'' +
                '}';
    }
}

