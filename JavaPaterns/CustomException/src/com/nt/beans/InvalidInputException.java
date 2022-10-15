package com.nt.beans;

public class InvalidInputException extends Exception{
	
	InvalidInputException(String errorMsg){
		super(errorMsg);
	}

}
