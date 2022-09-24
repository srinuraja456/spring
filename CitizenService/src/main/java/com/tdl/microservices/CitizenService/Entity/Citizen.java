package com.tdl.microservices.CitizenService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	@NotNull(message = "Name May not be null")
	@NotBlank(message = "Name May not be Blank")
	@NotEmpty(message = "Name may not be empty")
	private String name;
	@Column
	@NotNull(message = "vaccinationCenterId May not be null")
	@NotBlank(message = "vaccinationCenterId Name May not be Blank")
	@NotEmpty(message = "vaccinationCenterId Name may not be empty")
	private int vaccinationCenterId;
	
	

	
	

}
