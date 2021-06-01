package com.backend.Bluering.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Getter
@Setter
@Entity
@Table(name="facility")
public class Facility {

	@Id
	@GeneratedValue
	private long id;
	
	private String description;
	

	private String subDescription;
	private double actualLimit;
	private double authorizedAmount;
	private double requestedAmount;
	private double facilityChange; 
	private String economicSector;
	private String interestType;
	private double spreadOrRate;
	private Date reviewDate;
	private double interestRate;
	private String interestPeriod;
	private double intervalPeriod;
	private String penaltyRate; 
	private double CHDBCommissionPerMill;
	private String sourceOfRepayment;
	private String useOfFunds;
	private String repaymentTerms;
	private double totalNumberOfPayments;
	private Date startingDate;
	private String internalType;
	private String country;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade =CascadeType.MERGE)
	@JoinColumn(name="status_id",referencedColumnName="id",nullable=false)
	@JsonIgnoreProperties(ignoreUnknown=true)
	private Status status;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade =CascadeType.MERGE)
	@JoinTable(name="facility_security",
	joinColumns= { @JoinColumn(name= "facility_id")},
	inverseJoinColumns= { @JoinColumn(name="security_id")})
	@JsonIgnoreProperties(ignoreUnknown=true)
	private List<Security> securities;

	public Facility(String description, String subDescription, double actualLimit, double authorizedAmount,
			double requestedAmount, double facilityChange, String economicSector, String interestType,
			double spreadOrRate, Date reviewDate, double interestRate, String interestPeriod, double intervalPeriod,
			String penaltyRate, double cHDBCommissionPerMill, String sourceOfRepayment, String useOfFunds,
			String repaymentTerms, double totalNumberOfPayments, Date startingDate, String internalType,
			String country) {
		super();
		this.description = description;
		this.subDescription = subDescription;
		this.actualLimit = actualLimit;
		this.authorizedAmount = authorizedAmount;
		this.requestedAmount = requestedAmount;
		this.facilityChange = facilityChange;
		this.economicSector = economicSector;
		this.interestType = interestType;
		this.spreadOrRate = spreadOrRate;
		this.reviewDate = reviewDate;
		this.interestRate = interestRate;
		this.interestPeriod = interestPeriod;
		this.intervalPeriod = intervalPeriod;
		this.penaltyRate = penaltyRate;
		CHDBCommissionPerMill = cHDBCommissionPerMill;
		this.sourceOfRepayment = sourceOfRepayment;
		this.useOfFunds = useOfFunds;
		this.repaymentTerms = repaymentTerms;
		this.totalNumberOfPayments = totalNumberOfPayments;
		this.startingDate = startingDate;
		this.internalType = internalType;
		this.country = country;
	}
	public Facility() {}
	
}
