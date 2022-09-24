package com.td.test;

public class RevrsignWordINSentance {
	static String rev ="";
	
	static void wordRevrse(String str2) {
		String s="";
		char[] str1 = str2.toCharArray();
		for(char c: str1) {
			s = c+s;
		}
		rev= rev+s+" ";
		
	}
	
	public static void main(String[] args) {
		String s = "Helo Good"; //eHol oGdo
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(i==0) {
	       wordRevrse(str[i]);
			}
			else {
				rev=rev+str[i];
			}
	     
		}
	   
		System.out.println(rev);
	}

}
