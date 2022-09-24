package com.td.test;

import java.util.*;

public class RemovingDuplicates {

	public static void main(String[] args) {

		String[] str = { "Mumbai", "Chennai", "HYd", "Bengluru", "Chennai", "HYd" };
		String[] unq = new String[str.length];

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : str) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		// map.forEach((s,i) -> System.out.println("String "+s+" repeated "+i+"
		// time's"));

		/*
		 * for (int i = 0; i < str.length; i++) { int count = 0; for (int j = 0; j <
		 * str.length; j++) { if (i != j) { if (str[i].equals(str[j])) { count++; str[j]
		 * = "0"; } } } if (count ==0 && !str[i].equals("0")) {
		 * System.out.println("traditional method : " + str[i]); }
		 * 
		 * }
		 */
         int i=0;
		for (String s : str) {
			int count = 0;
			for (String s1 : str) { 
					if (s.equals(s1)) {
						count++;
					}
				}
			//System.out.println("Count for "+s+" is "+count);
			
			if (count ==1 ) {
				unq[i++]= s;	
			}
		}
      for (String s3 :unq) {
    	  System.out.println(s3);
      }
		
		Set<String> set = new HashSet<String>(Arrays.asList(str));
		// System.out.println(set);
		
		

	}

}
