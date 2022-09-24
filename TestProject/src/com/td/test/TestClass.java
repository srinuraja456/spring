package com.td.test;

import java.util.*;

public class TestClass {
	
	static ArrayList<Integer> al= new ArrayList<>();
	
	static void getDigits(int i){
		
		
		long number= 233466577981l;
		
		

		while(number%10!=0) {
		al.add((int) (number%10)); //al[i]= (number%10)
		number = number/10;
		
		}
	}
	
	public static void main(String[] args) {
		getDigits(0);
		
		Set<Integer> alDup =new TreeSet<Integer>();
		ArrayList<Integer> alUnq =new ArrayList<>();
	
	
	  for(int i=0;i<al.size();i++) {
		int dup= 0;
		int repeat=0;
		     for (int j =0; j<al.size();j++) {
			 if (al.get(i) == al.get(j)) {
			dup++;
			
			}
	      }//inner for 
		
		if(dup>1) {
			//System.out.println(number1[i]);
			alDup.add(al.get(i));
			
			}	
			else {
			alUnq.add(al.get(i));
			}
	}//for
	
	  System.out.println("Elements         : "+al);
	  System.out.println("Repeated Elements: "+alDup);
	  System.out.println("Unique elements  : "+alUnq);
	
	
	
	}


}
