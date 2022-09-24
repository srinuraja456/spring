package com.tdl.microservices.CitizenService.controller;

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

import java.util.Optional;
import com.tdl.microservices.CitizenService.Entity.Citizen;
import com.tdl.microservices.CitizenService.repository.CitizenRepo;





@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	@Autowired
	private CitizenRepo citzenrepo;
	
	
	
	@GetMapping(path="/test")
	public ResponseEntity<String> test(){
		
    return new ResponseEntity<>("hello",HttpStatus.OK);
		
	}
	
	
	  @RequestMapping(path="/id/{id}") public
	  ResponseEntity< Optional<Citizen>> getById(@PathVariable Integer id) {
	  java.util.Optional<Citizen> listOfCitizen = citzenrepo.findById(id);
	  return new ResponseEntity< Optional<Citizen>>(listOfCitizen,HttpStatus.OK);
	  
	  }
	  
	  @GetMapping(path="/vaccinationID/{id}") 
	  public ResponseEntity<List<Citizen>> getBiVaccantionId(@PathVariable Integer id) {
		  
	 List<Citizen> listOfCitizen = citzenrepo.findByVaccinationCenterId(id);
	  return new ResponseEntity<List<Citizen>>(listOfCitizen,HttpStatus.OK);
	  
	  }
	 
	 
 	
	@PostMapping(path="/add")
	public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen){
		
		Citizen citizen = citzenrepo.save(newCitizen);
		System.out.println("Requested Values"+citizen.getName()+" "+citizen.getVaccinationCenterId());
    return new ResponseEntity<Citizen>(citizen,HttpStatus.OK);
		
	}
	

}
