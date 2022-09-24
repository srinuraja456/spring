package com.nt.app.controller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import com.nt.app.entity.Student;
import com.nt.app.service.StudentService;

@Controller
public class SimpleController {
	
    @Autowired
	StudentService studentService;
	
	
	@RequestMapping(value= "/welcome", method = RequestMethod.GET)
	public String helloMsg(ModelMap model) {
		System.out.println("Controller class");
		
	Student s=	studentService.fetchStudentList(1);
	System.out.println(s);
	
	/*
	 * Student st=new Student(); st.setFirstName("Srinu"); st.setLastNmae("raja");
	 * st.setGuardianEmail("prasanthi@gmail.com"); st.setGuardianName("prasanthi");
	 * st.setEmailId("srinuraja456@gmail.com"); st.setGuardianMobile("7036868749");
	 * 
	 * studentService.save(st);
	 */
	
	
	//System.out.println("student name"+s.getFirstName()+s.getLastNmae());
		return "welcome";
		
	}

	
	

}
