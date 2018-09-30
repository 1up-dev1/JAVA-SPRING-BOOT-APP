package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.adminportal.domain.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
