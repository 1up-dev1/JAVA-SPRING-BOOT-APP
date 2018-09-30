package com.adminportal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.domain.Patient;
import com.adminportal.repository.PatientRepository;
import com.adminportal.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	private PatientRepository patientRepository;
	
	
	public Patient save(Patient patient) {
		return patientRepository.save(patient);
	}
	
	public List<Patient> findAll() {
		return (List<Patient>) patientRepository.findAll();
	}
	
	public Patient findOne(Long id) {
		return patientRepository.findOne(id);
	}
	
	public void removeOne(Long id) {
		patientRepository.delete(id);
	}
	
	
}
