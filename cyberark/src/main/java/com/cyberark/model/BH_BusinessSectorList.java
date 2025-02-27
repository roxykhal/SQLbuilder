package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_businesssectorlist")
public class BH_BusinessSectorList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long businessSectorID;
    @Column(name = "name")
    private String name;
    @Column(name = "parentBusinessSectorID")
    private long parentBusinessSectorID;
    @Column(name = "nestLevel")
    private long nestLevel;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "XPKBusinessSectorList_businessSectorID")
    private long XPKBusinessSectorList_businessSectorID;

    public BH_BusinessSectorList() {
    }
}
