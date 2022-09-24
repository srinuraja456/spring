package com.nt.SpringBootWebApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nt.controller"})
public class SpringBootWebApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApp1Application.class, args);
	}

}
