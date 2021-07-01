package com.backend.Bluering.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Bluering.entities.Security;
import com.backend.Bluering.repositories.SecurityRepository;

@Service
public class SecurityService {
	
    @Autowired
	SecurityRepository securityRepository;
    
    public List<Security> getAllSecurities(){
    	return securityRepository.findAll();
    	}
   
}
