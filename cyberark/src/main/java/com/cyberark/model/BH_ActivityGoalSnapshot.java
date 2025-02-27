package com.cyberark.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_activitygoalsnapshot")
public class BH_ActivityGoalSnapshot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long activityCount;
    @Column(name = "activityGoalTargetID")
    private long activityGoalTargetID;
    @Column(name = "activityGoalValue")
    private long activityGoalValue;
    @Column(name = "activityDate")
    private Date activityDate;

    public BH_ActivityGoalSnapshot() {
    }

    @Override
    public String toString() {
        return "BH_ActivityGoalSnapshot{" +
                "activityCount=" + activityCount +
                ", activityGoalTargetID=" + activityGoalTargetID +
                ", activityGoalValue=" + activityGoalValue +
                ", activityDate=" + activityDate +
                '}';
    }
}
