package com.td.test;

public class RevrseOfString {
	
	public static void main(String[] args) {
		String s ="SRINU";
		String rev="";
		char[] ch = s.toCharArray();
		
		for (int i=(ch.length-1);i>=0;i--) {
			rev= rev+ch[i];
		}
		System.out.println(rev);
		
	}

}
