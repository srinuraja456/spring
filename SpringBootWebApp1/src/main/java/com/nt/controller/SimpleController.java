package com.nt.controller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;





@RestController
public class SimpleController {
	
	/*
	 * @Autowired RestService rs;
	 */
	
	@RequestMapping("/welcome")
	public ModelAndView helloMsg() {
		
		String s="name";
	byte[] ch=new byte[s.length()];

		
		System.out.println("Controller class");
		//List<String> domains=new ArrayList<String>();
	    //rs.service();
		return new ModelAndView("welcome","msg","Welcome to SPRING BOOT Web Application");
		
	}

	
	

}
