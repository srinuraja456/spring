package com.tdl.microservices.VaccinationCenter.model;

import java.util.List;

import com.tdl.microservices.VaccinationCenter.Entity.VaccinationCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class VaccinationCenterModeData {
	
	private VaccinationCenter  VaccinationCenter;
	private List<Citizen> listOfCitizen;
	
	
	public VaccinationCenter getVaccinationCenter() {
		return VaccinationCenter;
	}
	public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
		VaccinationCenter = vaccinationCenter;
	}
	public List<Citizen> getListOfCitizen() {
		return listOfCitizen;
	}
	public void setListOfCitizen(List<Citizen> listOfCitizen) {
		this.listOfCitizen = listOfCitizen;
	}
	
	

}
