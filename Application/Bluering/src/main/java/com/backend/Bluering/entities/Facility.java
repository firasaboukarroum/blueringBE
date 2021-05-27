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

import lombok.Getter;
import lombok.Setter;
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
	
	@ManyToOne
	@JoinColumn(name="status_id",referencedColumnName="id",nullable=false)
	private Status status;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade =CascadeType.ALL)
	@JoinTable(name="facility_security",
	joinColumns= { @JoinColumn(name= "facility_id")},
	inverseJoinColumns= { @JoinColumn(name="security_id")})
	private List<Security> securities;

	
	
}
