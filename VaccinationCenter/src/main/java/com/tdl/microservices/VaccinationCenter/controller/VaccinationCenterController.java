package com.tdl.microservices.VaccinationCenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tdl.microservices.VaccinationCenter.Entity.VaccinationCenter;
import com.tdl.microservices.VaccinationCenter.controller.repository.CenterRepo;
import com.tdl.microservices.VaccinationCenter.model.Citizen;
import com.tdl.microservices.VaccinationCenter.model.VaccinationCenterModeData;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {

	@Autowired
	private CenterRepo centerrepo;
	
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping(path = "/addcenter")
	public ResponseEntity<VaccinationCenter> addVaccinationCenter(@RequestBody VaccinationCenter newVaccinationCenter) {

		VaccinationCenter vc = centerrepo.save(newVaccinationCenter);
		return new ResponseEntity<VaccinationCenter>(vc, HttpStatus.OK);

	}
	
	@GetMapping(path = "/id/{id}")
	public ResponseEntity<Citizen> getList(@PathVariable Integer id) {
      VaccinationCenterModeData vcmd=new VaccinationCenterModeData();
		System.out.println("getList method");
		VaccinationCenter vc = centerrepo.findById(id).get();
		
	    vcmd.setVaccinationCenter(vc);
	    System.out.println(" VaccinationCenter "+vc.getCenterName());
	 
Citizen citizens= restTemplate.getForObject("http://localhost:8081/citizen/id/"+1,Citizen.class);

		System.out.println("*************Listof citizens***************"+citizens);
	 //  vcmd.setListOfCitizen(citizens);
	    return new ResponseEntity<Citizen>(citizens,HttpStatus.OK) ;

	}

}
