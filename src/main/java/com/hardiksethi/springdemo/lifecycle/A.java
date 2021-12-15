package com.hardiksethi.springdemo.lifecycle;

public class A {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("inside init method");
	}
	
	public void destroy() {
		System.out.println("inside destroy method");
	}
}
