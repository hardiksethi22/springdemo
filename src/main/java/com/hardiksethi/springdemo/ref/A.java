package com.hardiksethi.springdemo.ref;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	private int x;
	@Autowired
	private B ob;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob.getY() + "]";
	}
	
	
}
