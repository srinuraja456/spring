package com.nt.list;

import java.util.Objects;

public class A {
	
	int x,y;
	
	public A(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public int hashCode() {
		return this.x+this.y;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof A) {
		A other = (A) obj;
		return (x == other.x) && (y == other.y);
		}
		else return false;
	}
	@Override
	public String toString() {
		return "A[x=" + x + ",y=" + y + "]....";
	}
	

}
