package com.backend.Bluering.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Bluering.repositories.SecurityRepository;

@Service
public class SecurityService {
	
    @Autowired
	SecurityRepository securityRepository;
}
