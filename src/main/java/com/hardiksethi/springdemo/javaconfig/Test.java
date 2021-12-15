package com.hardiksethi.springdemo.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(config.class);
		Student a = context.getBean("getStudent",Student.class);
		System.out.println(a);
		a.study();
	}

}
