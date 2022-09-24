package com.tdl.microservices.CitizenService.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

import java.util.logging.*;


@Component
@Slf4j
@Order(1)
public class CitizenServiceFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req= (HttpServletRequest) request;
		HttpServletResponse res= (HttpServletResponse) response;
		 
		Logger logger = Logger.getLogger(CitizenServiceFilter.class.getName());
		logger.info("*************Filter**********");
		logger.info("request id"+req.getRequestURI());
		
		
		if(req.getRequestURI().endsWith("1")) {
			
		logger.info("request name"+request.getClass().getName());
		chain.doFilter(request, response);
		}
		else {
			res.setHeader("Message","Authintication Failed");
			res.setStatus(403,"Authintication Failed");
		}
		
		chain.doFilter(request, response);
	}
	
 
}
