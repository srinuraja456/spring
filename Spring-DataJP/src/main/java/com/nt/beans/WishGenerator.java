package com.nt.beans;

import java.beans.JavaBean;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WishGenerator {


	public Date getDt() {
		return dt;
	}
	
	@Required
	public void setDt(Date dt) {
		this.dt = dt;
	}
	private String name;
	private Date dt;
    private Student st;
    
    
    
    
	
}
