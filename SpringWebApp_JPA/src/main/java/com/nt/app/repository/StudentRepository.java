package com.nt.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.app.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	List<Student> findByFirstName(String firstName);
	
	 @Override
	Optional<com.nt.app.entity.Student> findById(Long id);
	
   
 Student save(Student entity);
    	

}


