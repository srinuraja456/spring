package com.nt.service;
import org.springframework.stereotype.Service;

@Service
public class RestService {
	
	public String service() {
		System.out.println("service class");
		return "Good Service";
		
	}

}
