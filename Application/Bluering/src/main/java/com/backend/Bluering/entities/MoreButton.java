package com.backend.Bluering.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Getter
@Setter
@Entity
@Table(name="moreButton")
public class MoreButton {
	
	@Id
	@GeneratedValue
	private long Id;
	
	private String title;
	private String value;
	private String textChanged;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade =CascadeType.MERGE)
	@JoinTable(name="moreButton_facility",
	joinColumns= { @JoinColumn(name= "moreButton_id")},
	inverseJoinColumns= { @JoinColumn(name="facility_id")})
	@JsonIgnoreProperties(ignoreUnknown=true)
	private List<Facility> facilities;

	@ManyToMany(fetch=FetchType.LAZY, cascade =CascadeType.MERGE)
	@JoinTable(name="moreButton_security",
	joinColumns= { @JoinColumn(name= "moreButton_id")},
	inverseJoinColumns= { @JoinColumn(name="security_id")})
	@JsonIgnoreProperties(ignoreUnknown=true)
	private List<Security> securities;
	
	
}
