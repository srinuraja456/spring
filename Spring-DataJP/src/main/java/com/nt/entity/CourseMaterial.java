package com.nt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseMaterial {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long courseMaterialId;
	private String url;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="course_Id",referencedColumnName = "courseId")
	private Course course;
	

}
