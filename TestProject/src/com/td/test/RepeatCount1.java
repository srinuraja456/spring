package com.td.test;

import java.util.HashMap;
import java.util.Map;

public class RepeatCount1 {

	public static void main(String[] args) {
		//char[] ch =  {'a', 'b', 'c', 'a', 'c','c','c'};
		char[] ch = { 'g', 'd', 'h', 'h','c','e', 'g', 'g','c','c','c' };

		int max = 0;

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

		for (Map.Entry me : hm.entrySet()) {
			 if (me.getValue().equals(max)) {
			 System.out.println("highest repeated character : "+me.getKey()); } 
		}

		//System.out.println("max " + max);
	}

}
