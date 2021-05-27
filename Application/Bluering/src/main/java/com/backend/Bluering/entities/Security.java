package com.backend.Bluering.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

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
	
	@ManyToMany(fetch=FetchType.LAZY, cascade =CascadeType.ALL, mappedBy="securities")
	private List<Facility> facilities;

	
}
