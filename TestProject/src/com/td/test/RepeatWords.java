package com.td.test;

import java.security.DomainCombiner;

public class RepeatWords {
	public static void main(String[] args) {
		String s = "Hello Good Morning";
		String rev="";
		String[] words =s.split(" ");
		for(int i=( words.length-1);i>=0;i--) {
			rev=rev+words[i]+" ";
		}
		System.out.println(rev);
		
	}
	


}
