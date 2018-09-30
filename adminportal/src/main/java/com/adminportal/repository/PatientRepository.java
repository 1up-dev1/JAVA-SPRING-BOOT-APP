package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.adminportal.domain.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long>{

}
