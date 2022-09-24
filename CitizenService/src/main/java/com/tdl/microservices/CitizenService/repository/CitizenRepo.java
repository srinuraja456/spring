package com.tdl.microservices.CitizenService.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdl.microservices.CitizenService.Entity.Citizen;

public interface CitizenRepo  extends JpaRepository<Citizen,Integer>{

	List<Citizen> findByVaccinationCenterId(Integer id);

	
	//public List<Citizen> findbyVaccinationCenterId(Integer id);
}
