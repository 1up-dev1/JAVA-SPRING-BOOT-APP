package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.AssignedDoctors;

public interface AssignedDoctorsService {
	
	AssignedDoctors save(AssignedDoctors doctor);

	List<AssignedDoctors> findAll();
	
	AssignedDoctors findOne(Long id);
	
	void removeOne(Long id);

}
