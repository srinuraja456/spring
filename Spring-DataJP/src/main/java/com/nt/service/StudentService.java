package com.nt.service;

import java.util.List;

import com.nt.entity.*;

public interface StudentService {
	
	//Save Operation
	Student saveStudent(Student st);
	
	//Read operation
	List<Student> fetchStudentList(long id);
	
	//update Operation
	Student updateStudent(Student st,long id);
	
	//delete operation
	void deleteStudentById(long id);
	
}