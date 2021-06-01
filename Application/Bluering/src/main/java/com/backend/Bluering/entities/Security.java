package com.backend.Bluering.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.Getter;
import lombok.Setter;
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Getter
@Setter
@Entity
@Table(name="security")
public class Security {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String description;
	private String subDescription;
	private double currentAmount;
	private double currentSecurityValue;
	private double proposedAmount;
	private double proposedSecurityAmount;
	
	@JsonIgnore
	@ManyToMany(fetch=FetchType.LAZY, cascade =CascadeType.MERGE, mappedBy="securities")
	private List<Facility> facilities;

	public Security(String description, String subDescription, double currentAmount, double currentSecurityValue,
			double proposedAmount, double proposedSecurityAmount) {
		super();
		this.description = description;
		this.subDescription = subDescription;
		this.currentAmount = currentAmount;
		this.currentSecurityValue = currentSecurityValue;
		this.proposedAmount = proposedAmount;
		this.proposedSecurityAmount = proposedSecurityAmount;
		
	}

	public Security() {}
}
