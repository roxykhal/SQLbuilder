package com.cyberark.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="bh_placementchangerequest")
public class BH_PlacementChangeRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long placementChangeRequestID;
    @Column(name = "requestingUserID")
    private long requestingUserID;
    @Column(name = "approvingUserID")
    private long approvingUserID;
    @Column(name = "requestStatus")
    private String requestStatus;
    @Column(name = "requestType")
    private String requestType;
    @Column(name = "dateAdded")
    private Date dateAdded;
    @Column(name = "dateApproved")
    private Date dateApproved;
    @Column(name = "placementID")
    private long placementID;
    @Column(name = "status")
    private String status;
    @Column(name = "costCenter")
    private String costCenter;
    @Column(name = "reportTo")
    private String reportTo;
    @Column(name = "employmentType")
    private String employmentType;
    @Column(name = "salary")
    private long salary;
    @Column(name = "bonusPackage")
    private String bonusPackage;
    @Column(name = "optionsPackage")
    private String optionsPackage;
    @Column(name = "fee")
    private Double fee;
    @Column(name = "daysGuaranteed")
    private long daysGuaranteed;
    @Column(name = "daysProRated")
    private long daysProRated;
    @Column(name = "salaryUnit")
    private String salaryUnit;
    @Column(name = "employeeType")
    private String employeeType;
    @Column(name = "dateBegin")
    private Date dateBegin;
    @Column(name = "dateEnd")
    private Date dateEnd;
    @Column(name = "durationWeeks")
    private Double durationWeeks;
    @Column(name = "hoursPerDay")
    private Double hoursPerDay;
    @Column(name = "hoursOfOperation")
    private String hoursOfOperation;
    @Column(name = "dateEffective")
    private Date dateEffective;
    @Column(name = "dateClientEffective")
    private Date dateClientEffective;
    @Column(name = "payRate")
    private long payRate;
    @Column(name = "clientOvertimeRate")
    private Double clientOvertimeRate;
    @Column(name = "clientBillRate")
    private Double clientBillRate;
    @Column(name = "overtimeRate")
    private Double overtimeRate;
    @Column(name = "billingFrequency")
    private String billingFrequency;
    @Column(name = "workWeekStart")
    private long workWeekStart;
    @Column(name = "otherHourlyFee")
    private Double otherHourlyFee;
    @Column(name = "otherHourlyFeeComments")
    private String otherHourlyFeeComments;
    @Column(name = "salesManagerPercentGrossMargin")
    private Double salesManagerPercentGrossMargin;
    @Column(name = "recruitingManagerPercentGrossMargin")
    private Double recruitingManagerPercentGrossMargin;
    @Column(name = "comments")
    private String comments;
    @Column(name = "referralFee")
    private long referralFee;
    @Column(name = "referralFeeType")
    private String referralFeeType;
    @Column(name = "migrateGUID")
    private long migrateGUID;
    @Column(name = "statementUserID")
    private long statementUserID;
    @Column(name = "workersCompRateID")
    private long workersCompRateID;
    @Column(name = "terminationReason")
    private String terminationReason;
    @Column(name = "otExemption")
    private long otExemption;
    @Column(name = "housingManagerID")
    private long housingManagerID;
    @Column(name = "housingStatus")
    private String housingStatus;
    @Column(name = "vendorClientCorporationID")
    private long vendorClientCorporationID;
    @Column(name = "locationID")
    private long locationID;
    @Column(name = "jobCodeID")
    private long jobCodeID;
    @Column(name = "lineID")
    private long lineID;
    @Column(name = "billingProfileID")
    private long billingProfileID;
    @Column(name = "trackNumber")
    private long trackNumber;
    @Column(name = "taxState")
    private String taxState;
    @Column(name = "taxRate")
    private String taxRate;
    @Column(name = "isMultirate")
    private Boolean isMultirate;
    @Column(name = "generalLedgerServiceCodeID")
    private long generalLedgerServiceCodeID;
    @Column(name = "employmentStartDate")
    private Date employmentStartDate;
    @Column(name = "positionCode")
    private String positionCode;
    @Column(name = "benefitGroup")
    private String benefitGroup;
    @Column(name = "payGroupLookupID")
    private long payGroupLookupID;
    @Column(name = "payrollEmployeeTypeLookupID")
    private long payrollEmployeeTypeLookupID;
    @Column(name = "legalBusinessEntityID")
    private long legalBusinessEntityID;
    @Column(name = "payGroup")
    private String payGroup;
    @Column(name = "placementTimeAndExpenseChangeRequestID")
    private long placementTimeAndExpenseChangeRequestID;
    @Column(name = "timesheetCycleID")
    private long timesheetCycleID;
    @Column(name = "approvingClientContactID")
    private long approvingClientContactID;
    @Column(name = "backupApprovingClientContactID")
    private long backupApprovingClientContactID;
    @Column(name = "estimatedEndDate")
    private Date estimatedEndDate;

    public BH_PlacementChangeRequest() {
    }
}
