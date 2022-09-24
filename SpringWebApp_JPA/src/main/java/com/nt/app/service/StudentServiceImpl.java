package com.nt.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.app.entity.Student;
import com.nt.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	
	@Autowired
     private	StudentRepository studentRepository;
	
    @Override
    public Student saveStudent(Student st) {
        return null;
    }
    
    @Override
    public Student fetchStudentList(long id) {
   
    	System.out.println("StudentServiceImpl");
    	System.out.println("id value :"+id);
    Optional<Student>	st =studentRepository.findById(id);
   Student s= st.get();
		return s;
        
    }
    
    
    
    public Student save(Student st) {
    	   
    	System.out.println("StudentServiceImpl");	
    	
    	studentRepository.save(st);
		return st;
        
    }
    
    
    @Override
    public Student updateStudent(final Student st, final long id) {
        return null;
    }
    
    @Override
    public void deleteStudentById(final long id) {
    	
    }
}