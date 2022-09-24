package com.nt.map;

import java.util.HashMap;

public class TestHashMAp {
	
	public static void main(String[] args) {
		
		HashMap<Object,Object> hm=new HashMap<>();
		
		
		
		hm.put("a",1);
		
		//"b".hashcode() % 16 --> 2 ==> New bucket created and obj is added to bucket
		hm.put("b",2);
		
		
	
		
 		
	}

}
