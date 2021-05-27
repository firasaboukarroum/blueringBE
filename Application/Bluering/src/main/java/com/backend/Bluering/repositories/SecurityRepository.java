package com.backend.Bluering.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Bluering.entities.Security;
@Repository
public interface SecurityRepository extends JpaRepository<Security, Long>{

}
