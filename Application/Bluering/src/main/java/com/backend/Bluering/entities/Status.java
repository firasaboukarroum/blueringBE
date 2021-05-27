package com.backend.Bluering.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

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
	
	@OneToMany(mappedBy = "status")
	private List<Facility> facilities;

	
	
	
}
