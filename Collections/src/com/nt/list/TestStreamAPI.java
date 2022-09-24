package com.nt.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TestStreamAPI {
	public static void main(String[] args) {

		List<String> list = List.of("Raviteja", "Bunny", "Arjun", "Sharkhan", "kamal", "Vijay", "Tony", "Hari Krishna");

		Set<String> set = Set.of("Raviteja", "Bunny", "Arjun", "Sharkhan", "kamal", "Vijay", "Tony", "Hari Krishna");

		// Random Access
		String name = list.get(4);
		System.out.println(name);

		// Sequencial access
		for (int i = 0; i < list.size(); i++) {
			name = list.get(i);
			System.out.println(name);
		}

		// Enumeration list
		Enumeration<String> en = Collections.enumeration(list);
		while (en.hasMoreElements()) {
			System.out.println("List Enumeration " + en.nextElement());
		}

		//// Enumeration Set
		Enumeration<String> en1 = Collections.enumeration(set);
		while (en1.hasMoreElements()) {
			System.out.println("Set Enumeration " + en1.nextElement());
		}

		// Iterator //JAVA 1.2

		Iterator<String> itr;
		itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println("Iterator : " + itr.next());
		}

		list.forEach(a -> System.out.println("For each loop " + a));

		Consumer c;

		ListIterator<String> lit = list.listIterator();
		// lit.add("Mahesh");

		while (lit.hasNext()) {
			System.out.println("list  iterating" + lit.next());
		}

		List<Person> lip = new ArrayList<Person>();

		lip.add(new Person(1, "Srinu", 1100000, "Hyd"));
		lip.add(new Person(4, "Sunil", 1500000, "Hyd"));
		lip.add(new Person(5, "Divya", 1600000, "Hyd"));
		lip.add(new Person(2, "Raja", 1000000, "Hyd"));
		lip.add(new Person(3, "Nag", 2200000, "Hyd"));
		System.out.println(" person");
		// lip.stream().map(p-> p.getSalary()).filter(sal ->
		// sal>1500000).forEach(p->System.out.println(" Sal "+p));
		/*
		 * lip.stream() .map(p-> p.getName()) .filter(s->s.startsWith("S"))
		 * .forEach(p->System.out.println(" Sal "+p));
		 */

		lip.stream().filter(p -> p.getSalary()>1500000).collect(Collectors.toList());
	List<Person> IncrementListEmployee = lip.stream().peek(p -> p.setSalary(p.getSalary()+10000) ).collect(Collectors.toList());
	   
	IncrementListEmployee.forEach(s -> System.out.println(s));
		
	
		System.out.println(lip.stream().map(p -> p.getName()).filter(s -> s.startsWith("S")).findFirst().get());
		lip.forEach(System.out::println);
		System.out.println("  // ");
		lip.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
				/*
				 * .sorted((p1,p2)-> p1.getId()<p2.getId() ? -1 : p1.getId()>p2.getId() ? 1 : 0)
				 */

				.forEach(System.out::println);

		List<A> li = new ArrayList<A>();
		li.add(new A(2, 4));
		li.add(new A(1, 5));
		li.add(new A(1, 6));
		li.add(new A(1, 7));
		li.add(new A(1, 8));
		li.add(new A(5, 6));
		li.add(new A(7, 8));
		li.add(new A(9, 10));
		li.add(new A(10, 10));

		System.out.println("list object: "
				+ (li.stream().max((a1, a2) -> a1.x < a2.x ? -1 : a1.x > a2.x ? 1 : 0)).get());

		List<B> li1 = new ArrayList<B>();
		li1.add(new B('d', 'c'));
		li1.add(new B('b', 'z'));
		li1.add(new B('c', 'n'));

		li1.stream().sorted((a1, a2) -> a1.a < a2.a ? -1 : a1.a > a2.a ? 1 : 0).forEach(System.out::println);

	}

}
