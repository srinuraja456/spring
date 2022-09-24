package com.nt.list;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class LinkedListTest {
	
    static void test() {
		LinkedList<Object> ll =new LinkedList<>();
		System.out.println("object: "+ll);
		
		ll.add("a");
		ll.add(123);
		ll.add("a");
		ll.add(6.7);
		
		
		System.out.println("Object"+ll);
		ll.add(8);
		ListIterator<Object>  it= ll.listIterator();
		it.next();
		it.remove();
		ll.add("3");
		
		
		
		System.out.println("Object"+ll);
		System.out.println();
    }
		public static void main(String[] args) {
			
		
		
		List<Employee> emp = new ArrayList<>();  
        emp.add(new Employee("Dipak", "Delhi", 21));  
        emp.add(new Employee("Sumit", "Delhi", 21));  
        emp.add(new Employee("Karan", "Delhi", 23));  
        emp.add(new Employee("Mona", "Udaipur", 23));  
        emp.add(new Employee("Rajesh", "Banglore", 23));  
        emp.add(new Employee("Niraj", "Banglore", 31));          
        /* Group by Employees by city before Java 8 world */         
        Map<String,List<Employee>> EmpByCity = new HashMap<String,List<Employee>>();  
          
        for(Employee p : emp)  
        {  
            if(!EmpByCity.containsKey(p.getCity()))  
            {  
                EmpByCity.put(p.getCity(), new ArrayList<>());                  
            }  
            EmpByCity.get(p.getCity()).add(p);
            //(p.getCity()).add(p);  
        }  
        System.out.println("Employees grouped by cities before Java 8 : " + EmpByCity);        
        /* group objects of Employee class in Java 8 */  
        EmpByCity =  emp.stream().collect(Collectors.groupingBy(Employee::getCity));  
        System.out.println("Employees grouped by cities in Java 8: " + EmpByCity);  
		
		List l= emp.stream().
				peek(p -> p.setName(p.getName().toUpperCase()))
				.collect(Collectors.toList());
		System.out.println("peek"+l);
		String s="abc";
		System.out.println("upper: "+s.toUpperCase());
		
       // emp.stream().peek(p -> p.setName(p.getName().toUpperCase()));
	}

}
