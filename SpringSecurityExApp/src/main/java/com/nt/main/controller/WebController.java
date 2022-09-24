package com.nt.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/")
public class WebController {
	
	@GetMapping("/")
	String hello(){
		return "home";
	}
	
	@GetMapping("/offers")
	public String offers() {
		return null;
		
	}
	
	@GetMapping("/balance")
	public String balance() {
		return null;
		
	}
	
	
	@GetMapping("/loanApprove")
	public String approveLoan() {
		return "loan";
		
	}
	
	@GetMapping("/denied")
	public String accessDenied() {
		return "access_denied";
		
	}
	

}
