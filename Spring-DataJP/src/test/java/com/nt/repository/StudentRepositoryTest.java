package com.nt.repository;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nt.SpringDataJPATutorial.SpringDataJpaTutorialApplication;
import com.nt.entity.Student;

import lombok.Data;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest(classes = SpringDataJpaTutorialApplication.class)
class StudentRepositoryTest {
	
	@Autowired(required = true)
	private StudentRepository studentRepository;

	@Test
	public void saveStudent() {
		 Student st =  Student.builder().
				 firstName("Srinu").
				 lastNmae("veluvarthi").
				 emailId("srinuraja456@gmail.com").
				 guardianName("prasanthi").
				 guardianEmail("prasanthi@gmail.com").
				 guardianMobile("7036868749").build();
				 
		 studentRepository.save(st);
		 
		 
		
	}
    @Test
    public void printStudentByFirstName() {
	
	
	List<Student>  lt= studentRepository.findByFirstName("srinu")  ;
	System.out.println(lt.get(0).getFirstName());
	
}
}


