package com.nt.main.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/")
public class SecurityController {
	
	@GetMapping("/welcome")
	String welcome() {
		return "Welcome";
	}
	
	

}
