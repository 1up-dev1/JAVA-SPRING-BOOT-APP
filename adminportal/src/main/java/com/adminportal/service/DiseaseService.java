package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.Disease;

public interface DiseaseService {

	Disease save(Disease diseaseType);

	List<Disease> findAll();
	
	Disease findOne(Long id);
	
	void removeOne(Long id);
}
