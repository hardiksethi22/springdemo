package com.hardiksethi.springdemo.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class B implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public B() {
		super();
	}

	@Override
	public String toString() {
		return "B [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destroy");
	}
	
}
