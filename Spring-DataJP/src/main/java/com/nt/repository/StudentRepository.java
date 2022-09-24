package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
   public List<Student> findByFirstName(String firstName);



}
