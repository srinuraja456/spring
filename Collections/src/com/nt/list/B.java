package com.nt.list;

public class B {
	char a,b;
    String s ="a";
	public B(char a, char b) {
		this.a = a;
		this.b = b;
		System.out.println("a hascode"+ s.hashCode());
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			B b= (B)obj;
			return b.a==this.a && b.b==this.b;
		}
		else return false;
	}

	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + "]";
	}
	
	
	

}
