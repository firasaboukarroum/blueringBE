package com.backend.Bluering.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Bluering.repositories.StatusRepository;

@Service
public class StatusService {
	@Autowired
	StatusRepository statusRepository;

}
