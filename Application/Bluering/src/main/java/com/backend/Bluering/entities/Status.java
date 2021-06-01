package com.backend.Bluering.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.Getter;
import lombok.Setter;
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Entity
@Table(name="status")
@Getter
@Setter
public class Status {

	@Id
	@GeneratedValue
	private long id;
	
	private String statusDescription;
	
	private String color;
	
	@JsonIgnore
	@OneToMany(fetch=FetchType.LAZY, cascade =CascadeType.MERGE,mappedBy = "status")
	private List<Facility> facilities;

	public Status(String statusdescription, String color) {
		this.statusDescription=statusdescription;
		this.color=color;
	}
	public Status() {}
	
	
	
}
