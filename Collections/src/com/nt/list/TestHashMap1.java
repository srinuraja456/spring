package com.nt.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

public class TestHashMap1 {
	
	public static void main(String[] args) {
		
		HashMap<Object,Object> hm=new HashMap<Object,Object>();
		System.out.print(hm.put("a",1)); System.out.println(hm);
		System.out.print(hm.put("b",2)); System.out.println(hm);
		
		System.out.print(hm.put("c",5));System.out.println(hm);
		
		System.out.print(hm.put("a",2));System.out.println(hm);
		System.out.print(hm.put(97,3)); System.out.println(hm);
		System.out.print(hm.put(98,3)); System.out.println(hm);
		System.out.print(hm.put("b",4)); System.out.println(hm);
		System.out.print(hm.put(new A(5,6),4)); System.out.println(hm);
		System.out.print(hm.put(new A(6,5),4)); System.out.println(hm);
		System.out.print(hm.put(new A(3,4),6)); System.out.println(hm);
		
		LinkedListTest ll= new LinkedListTest();
		LinkedListTest.test();
		

		
	//	TreeSet<A> ts=new TreeSet<>();
	//	System.out.println(ts.add(new A(6,7)));
		
		System.out.println(ll);		
	}
	
	
}
