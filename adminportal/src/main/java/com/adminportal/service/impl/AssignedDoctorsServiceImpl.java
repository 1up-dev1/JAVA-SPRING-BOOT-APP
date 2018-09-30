package com.adminportal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.domain.AssignedDoctors;
import com.adminportal.repository.AssignedDoctorsRepository;
import com.adminportal.service.AssignedDoctorsService;

@Service
public class AssignedDoctorsServiceImpl implements AssignedDoctorsService{
	
	@Autowired
	private AssignedDoctorsRepository assignedDoctorsRepository;
	
	public List<AssignedDoctors> findAll(){
		return (List<AssignedDoctors>) assignedDoctorsRepository.findAll();
	}
	
	public AssignedDoctors save(AssignedDoctors doctor) {
		return assignedDoctorsRepository.save(doctor);
	}
	
	
	public AssignedDoctors findOne(Long id) {
		return assignedDoctorsRepository.findOne(id);
	}
	
	public void removeOne(Long id) {
		assignedDoctorsRepository.delete(id);
	}
}
