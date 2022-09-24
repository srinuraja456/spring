package com.nt.SpringDataJPATutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.nt.entity.Student;

@SpringBootApplication
@EntityScan(basePackages = {"com.nt.entity"})
@ComponentScan("com.nt.repository")
public class SpringDataJpaTutorialApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaTutorialApplication.class, args);
	}

}
