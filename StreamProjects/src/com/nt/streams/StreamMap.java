package com.nt.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamMap {
	
      static StreamMap sm=null;
      
	static {
	sm= new StreamMap();
	}
	
	public  void print(Integer i) {
		System.out.println( "Method refrence and value :"+i);
		
	}
	public  void print(String s) {
		//System.out.println( "Method refrence and value1 :"+s);
		
	}
	public static void main(String[] args) {
		
	
	
	List<Integer> list= Arrays.asList(22,22,23,45,50,70,70,70);
	Integer i=list.stream().reduce(25, (a,b)-> a+b);
	System.out.println("i value "+i);
	
	  Collection<Integer> list1=list.stream().map(number -> number*3).collect(Collectors.toCollection(TreeSet::new)); 
	  for(Integer elements :list1) { 
		  System.out.println(elements);
	  
	  
	  }
	 
	
	list.stream().map(i1-> i1.toString()).forEach(StreamMap.sm::print);

	}
	
}
