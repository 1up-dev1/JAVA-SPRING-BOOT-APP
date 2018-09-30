package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.adminportal.domain.Disease;

public interface DiseaseRepository extends CrudRepository<Disease, Long> {

}
