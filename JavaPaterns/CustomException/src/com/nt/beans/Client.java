package com.nt.beans;

public class Client {
	
	static void getAge(int age) throws InvalidInputException{
		
		
		if (age <=18) {
			throw new InvalidInputException("Entered Age persons are not allowed");
		}
		System.out.println("age"+age);
	}

	public static void main(String[] args) {
		try {
		Client.getAge(17);
		}
		catch(Exception e) {
			e.getMessage();
		}
		
	}
}
