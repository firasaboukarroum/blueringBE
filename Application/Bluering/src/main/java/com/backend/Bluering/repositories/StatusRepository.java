package com.backend.Bluering.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Bluering.entities.Status;
@Repository
public interface StatusRepository extends JpaRepository<Status, Long>{

}
