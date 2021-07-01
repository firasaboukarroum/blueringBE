package com.backend.Bluering.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Bluering.entities.Facility;
import com.backend.Bluering.repositories.FacilityRepository;

@Service
public class FacilityService {
	
    @Autowired
	FacilityRepository facilityRepository;
    
    public List<Facility> getAllFacilities(){
    	return facilityRepository.findAll();
    }
    
    public Facility findFacilityById(Long id) {
    	return facilityRepository.getById(id);
    }
   
    
	
}
