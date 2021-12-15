package com.hardiksethi.springdemo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

	
	  @Bean public Samosa getSamosa() { Samosa samosa =new Samosa(); return samosa;
	  }
	 
	@Bean
	public Student getStudent() {
		Student student = new Student();
		return student;
	}
}
