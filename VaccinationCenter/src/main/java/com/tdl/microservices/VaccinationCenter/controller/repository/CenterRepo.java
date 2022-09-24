package com.tdl.microservices.VaccinationCenter.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdl.microservices.VaccinationCenter.Entity.VaccinationCenter;

public interface CenterRepo extends JpaRepository<VaccinationCenter, Integer> {
	
	
}
