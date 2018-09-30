package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.Doctor;

public interface DoctorService {

	Doctor save(Doctor doctorType);

	List<Doctor> findAll();
	
	Doctor findOne(Long id);
	
	void removeOne(Long id);
}
