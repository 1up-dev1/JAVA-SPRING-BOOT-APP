package com.adminportal.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	//private String treatedBy;
	private String gender;
	private int age;
	private double weight;

	private String diseaseType;
	private String doctorName;

	private boolean active = true;
	
	@Column(columnDefinition = "text")
	private String description;

	@Transient
	private MultipartFile patientImage;

	@Transient
	public List<Disease> diseaseTypeList;
	@Transient
	public List<Doctor> doctorNameList;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "patient")
	private AssignedDoctors doctor;

	

	public List<Doctor> getDoctorNameList() {
		return doctorNameList;
	}

	public void setDoctorNameList(List<Doctor> doctorNameList) {
		this.doctorNameList = doctorNameList;
	}
	
	public List<Disease> getDiseaseTypeList() {
		return diseaseTypeList;
	}

	public void setDiseaseTypeList(List<Disease> diseaseTypeList) {
		this.diseaseTypeList = diseaseTypeList;
	}

	public AssignedDoctors getDoctor() {
		return doctor;
	}

	public void setDoctor(AssignedDoctors doctor) {
		this.doctor = doctor;
	}

	

	/*public String getTreatedBy() {
		return treatedBy;
	}

	public void setTreatedBy(String treatedBy) {
		this.treatedBy = treatedBy;
	}*/

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDiseaseType() {
		return diseaseType;
	}

	public void setDiseaseType(String diseaseType) {
		this.diseaseType = diseaseType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getPatientImage() {
		return patientImage;
	}

	public void setPatientImage(MultipartFile patientImage) {
		this.patientImage = patientImage;
	}

}
