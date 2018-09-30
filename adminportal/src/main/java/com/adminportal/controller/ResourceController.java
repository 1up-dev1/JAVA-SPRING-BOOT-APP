package com.adminportal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adminportal.service.PatientService;

@RestController
public class ResourceController {

	@Autowired
	private PatientService patientService;
	
	@RequestMapping(value="/patient/removeList", method=RequestMethod.POST)
	public String removeList(@RequestBody ArrayList<String> patientIdList, Model model){
		
		for (String id : patientIdList) {
			String patientId =id.substring(8);
			patientService.removeOne(Long.parseLong(patientId));
		}
		
		return "delete success";
	}
}
