package com.nt.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long courseId;
	private String title;
	
	@OneToOne(cascade =CascadeType.ALL,mappedBy ="course" )
	private CourseMaterial courseMaterial;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="teacher_id",referencedColumnName = "teacherId")
	private Teacher teacher;


}

