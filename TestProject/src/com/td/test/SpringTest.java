package com.td.test;

public class SpringTest {
	public static void main(String[] args) {
		String s = "Helo Good"; //eHol oGdo
		 char[] c= s.toCharArray();
		String rev ="";
            	  for(int i=0;i<c.length;i=i+2) {
            		 // if(i%2!=0 && i!=0) {
            		  if(i<c.length)
            			  rev=rev+c[i]+c[i-1]; //eH
            		  //} 
            		  
            	  }
            	  System.out.println(rev);
              }
             
	}


