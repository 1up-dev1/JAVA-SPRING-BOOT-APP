package com.adminportal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "diseasetype")
public class Disease {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long id;
	
	public String diseaseTypeValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDiseasetype() {
		return diseaseTypeValue;
	}

	public void setDiseasetype(String diseaseTypeValue) {
		this.diseaseTypeValue = diseaseTypeValue;
	}
	
	

}
