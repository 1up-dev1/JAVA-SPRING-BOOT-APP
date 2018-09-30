package com.adminportal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.domain.Doctor;
import com.adminportal.repository.DoctorRepository;
import com.adminportal.service.DoctorService;


@Service
public class DoctorServiceImpl implements DoctorService{
	

	
	@Autowired
	private DoctorRepository doctorRepository;
	
	public List<Doctor> findAll(){
		return (List<Doctor>) doctorRepository.findAll();
	}
	
	public Doctor save(Doctor doctorType) {
		return doctorRepository.save(doctorType);
	}
	
	public Doctor findOne(Long id) {
		return doctorRepository.findOne(id);
	}
	
	public void removeOne(Long id) {
		doctorRepository.delete(id);
	}



}
