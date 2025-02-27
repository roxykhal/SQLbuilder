package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="bh_appointmentedithistoryfieldchange")
public class BH_AppointedHistoryFieldChange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long appointmentEditHistoryFieldChangeID;
    @Column(name = "appointmentEditHistoryID")
    private long appointmentEditHistoryID;
    @Column(name = "columnName")
    private String columnName;
    @Column(name = "display")
    private String display;
    @Column(name = "oldValue")
    private String oldValue;
    @Column(name = "newValue")
    private String newValue;

    public BH_AppointedHistoryFieldChange() {
    }

    @Override
    public String toString() {
        return "BH_AppointedHistoryFieldChange{" +
                "appointmentEditHistoryFieldChangeID=" + appointmentEditHistoryFieldChangeID +
                ", appointmentEditHistoryID=" + appointmentEditHistoryID +
                ", columnName='" + columnName + '\'' +
                ", display='" + display + '\'' +
                ", oldValue='" + oldValue + '\'' +
                ", newValue='" + newValue + '\'' +
                '}';
    }
}
