package com.backend.Bluering.entities;


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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
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
	private String facilityType;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "facilities"})
	@ManyToMany(fetch=FetchType.LAZY, cascade =CascadeType.MERGE, mappedBy="facilities")
	private List<MoreButton> moreButtons;
	
	
	
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
			double requestedAmount) {
		super();
		this.description = description;
		this.subDescription = subDescription;
		this.actualLimit = actualLimit;
		this.authorizedAmount = authorizedAmount;
		this.requestedAmount = requestedAmount;
		
	}
	public Facility() {}
	
}
