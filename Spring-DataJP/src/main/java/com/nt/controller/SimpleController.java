package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.RestService;
import com.nt.service.StudentService;



@RestController
public class SimpleController {
	
	@Autowired
	StudentService ss;
	
	@RequestMapping(value="/welcome.htm")
	public ModelAndView helloMsg() {
		System.out.println("Controller class");
		
	ss.fetchStudentList(1);
		return new ModelAndView("welcome", "msg", "Welcome to SPRING MVC");
		
	}

	/*@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Controller class");
		return new ModelAndView("welcome", "msg", "Welcome to Spring MVC"	);
	}
	*/
	

}
