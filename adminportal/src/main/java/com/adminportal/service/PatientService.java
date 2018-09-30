package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.Patient;

public interface PatientService {
	
	Patient save(Patient patient);

	List<Patient> findAll();
	
	Patient findOne(Long id);
	
	void removeOne(Long id);
	
	
}
