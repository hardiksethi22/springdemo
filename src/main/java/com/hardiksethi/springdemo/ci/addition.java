package com.hardiksethi.springdemo.ci;

public class addition {
	private int a;
	private int b;
	public addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor int, int");
	}
	public addition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor double, double");
	}
	
	public void doSum() {
		System.out.println("Sum is " + (this.a + this.b));
	}
	
}
