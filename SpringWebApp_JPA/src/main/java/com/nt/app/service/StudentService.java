package com.nt.app.service;

import java.util.List;

import com.nt.app.entity.Student;

public interface StudentService
{
    Student saveStudent(Student st);
    
    Student fetchStudentList(long id);
    
    Student updateStudent(Student st, final long id);
    
    void deleteStudentById(long id);

	Student save(Student st);
}