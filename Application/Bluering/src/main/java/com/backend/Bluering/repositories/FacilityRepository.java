package com.backend.Bluering.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Bluering.entities.Facility;
@Repository
public interface FacilityRepository extends JpaRepository<Facility, Long>{

}
