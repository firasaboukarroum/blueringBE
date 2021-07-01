package com.backend.Bluering.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.backend.Bluering.entities.Security;
import com.backend.Bluering.services.SecurityService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/securities/")
@ResponseBody
public class SecurityController {
	@Autowired
	private SecurityService securityService;
	
	//to get all securities
	@GetMapping("all")
    public List<Security> getFacilities() {
		
		return securityService.getAllSecurities();}
	
		
	
	

}
