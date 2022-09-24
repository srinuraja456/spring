package com.nt.list;

public class Employee {
	
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	String city;
	long id;

	public Employee(String name, String city, int i) {
		this.id=i;
		this.name=name;
		this.city=city;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", city=" + city + ", id=" + id + "]";
	}
	
	
	
	

}
