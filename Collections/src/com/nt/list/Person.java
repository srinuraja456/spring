package com.nt.list;


public class Person {
	
	private long id;
	private String name;
	private long Salary;
	private String Adress;
	
	public Person(long id, String name, long salary, String adress) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		Adress = adress;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", Salary=" + Salary + ", Adress=" + Adress + "]";
	}

	
	
	

}
