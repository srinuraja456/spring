package com.nt.exceptionHandling;

public class TryCatchWithReturn {
	public static void main(String[] args) {
		
	System.out.println("main1 started");
	int i = 0;
	try {
		i=0;
		while(i++==0) {
			System.out.println("in  while : i value is "+i);
			
		}
		
	}
		catch(Exception e) {
			System.out.println("catch blocks");
			
		}

	System.out.println("i value out side try and catch"+i);
	}

}
