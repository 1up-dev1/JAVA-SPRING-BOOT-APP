package com.adminportal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.domain.Disease;
import com.adminportal.repository.DiseaseRepository;
import com.adminportal.service.DiseaseService;


@Service
public class DiseaseServiceImpl implements DiseaseService{
	

	
	@Autowired
	private DiseaseRepository diseaseRepository;
	
	public List<Disease> findAll(){
		return (List<Disease>) diseaseRepository.findAll();
	}
	
	public Disease save(Disease diseaseType) {
		return diseaseRepository.save(diseaseType);
	}
	
	public Disease findOne(Long id) {
		return diseaseRepository.findOne(id);
	}
	
	public void removeOne(Long id) {
		diseaseRepository.delete(id);
	}


}
