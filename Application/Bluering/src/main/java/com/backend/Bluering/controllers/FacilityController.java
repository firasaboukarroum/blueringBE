package com.backend.Bluering.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.Bluering.entities.Facility;
import com.backend.Bluering.entities.Security;
import com.backend.Bluering.entities.Status;
import com.backend.Bluering.services.FacilityService;
import com.backend.Bluering.services.StatusService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/facilities/")
@ResponseBody
public class FacilityController {
	
	@Autowired
	FacilityService facilityService;
	
	@Autowired
	StatusService statusservice;
	
	//to get all facilities
	@GetMapping("all")
    public List<Facility> getFacilities() {
		
		return facilityService.getAllFacilities();
		
	}
	
	//to get the status of a facility by facility id
	@GetMapping("status/{id}")
	  public Status getFaciltyStatusByFacilityId(@PathVariable Long id){
		  Facility facility=facilityService.findFacilityById(id);
		  Status status= facility.getStatus();
		  return status;
	  }
	
	//to get Facility By Id
	@GetMapping("facility/{id}")
	  public Facility getFacilityById(@PathVariable Long id){
		  return facilityService.findFacilityById(id);
	  }
	
	//to get Securities of a facility by facility Id
	@GetMapping("securities/{id}")
	public List<Security> getSecuritiesByFacilityId(@PathVariable Long id){
		Facility facility=facilityService.findFacilityById(id);
		List<Security> securities=facility.getSecurities();
		return securities;
	}
	
}
