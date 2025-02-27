package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_clientcorporationcustomobject")
public class BH_ClientCorporationCustomObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientCorporationCustomObjectID;
    @Column(name = "name")
    private String name;
    @Column(name = "tabName")
    private String tabName;
    @Column(name = "displayType")
    private String displayType;
    @Column(name = "enabled")
    private long enabled;
    @Column(name = "description")
    private String description;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "staticTemplateName")
    private String staticTemplateName;
    @Column(name = "reportID")
    private long reportID;
    @Column(name = "corporationID")
    private long corporationID;
    @Column(name = "objectNumber")
    private long objectNumber;
    @Column(name = "useClientDefinedName")
    private Boolean useClientDefinedName;
    @Column(name = "isHidden")
    private Boolean isHidden;
    @Column(name = "icon")
    private String icon;

    public BH_ClientCorporationCustomObject() {
    }
}
