package com.td.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountRepeat {

	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 'c','c','c' };
		int max= 0;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : ch) {

			if (hm.containsKey(c)) {
				if(hm.get(c) + 1>max) {
				max = hm.get(c) + 1;}
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
			
		for(Map.Entry me : hm.entrySet()) {
			
			//System.out.println(me.getKey()+" "+me.getValue());
		  if (me.getValue().equals(max)) {
				  System.out.println("highest repeated char:"+me.getKey());
				  }
			
		}
		
		
		//System.out.println("max : "+ max);
		
		

		/*
		 * for (int i=0;i<ch.length;i++) { int repeat =0; for (int j=0;j<ch.length;j++)
		 * { //System.out.println(j); if(i!=j) { if (ch[i]==ch[j]) { repeat++;
		 * ch[j]='0'; } } } if(ch[i]!='0') System.out.println(ch[i]+
		 * "repeates "+(repeat+1)+" times"); }
		 */
	}

}
