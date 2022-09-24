package com.nt.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestPersons {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of the Array");
		int size = sc.nextInt();
		System.out.println("Enter the person names of the Array");
		//String nameInput = sc.next(); //names = srinu,Abhi,nag,narendara,ram;
		String nameInput = "srinu,Abhi,nag,narendara,ram"; 
		System.out.println("Enter the person hiegth of the Array");
		//String ageInput = sc.next();  //ages =  5,7,6,4,8;
		String ageInput = "5,7,6,4,8";

		String[] names = nameInput.split(",");
		String[] height = ageInput.split(",");
		        
	
		Map<Integer, String> map = new HashMap<Integer, String>();

		for (int i = 0; i < names.length; i++) {
			System.out.println( height[i].replaceAll("^\"|\"$", ""));
			map.put(Integer.parseInt(height[i].replaceAll("^\"|\"$", "")), names[i].replaceAll("^\"|\"$", ""));
		}

		List<Integer> list1 = map.keySet().stream().sorted((p1, p2) -> (p1 > p2) ? -1 : (p1 < p2) ? 1 : 0).toList();
		List<Entry<Integer,String>> list2 = map.entrySet().stream().sorted((p1,p2) -> p1.getValue().compareTo(p2.getValue())).toList();         
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(map.get(list1.get(i)) + ", ");
		}
		list2.stream().forEach(s-> System.out.print(s.getValue()+","));
	}

}
