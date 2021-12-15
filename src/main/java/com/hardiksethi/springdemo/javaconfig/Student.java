package com.hardiksethi.springdemo.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

public class Student {
	@Autowired
	private Samosa samosa;
	public void study() {
		samosa.display();
		System.out.println("student is studying");
	}
	public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
