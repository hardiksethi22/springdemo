package com.hardiksethi.springdemo.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/hardiksethi/springdemo/standalone/collections/standaloneConfig.xml");
		Person a = (Person)context.getBean("person1");
		//Person a = (Person)context.getBean("person1");
		/*
		 * System.out.println(a.getX()); System.out.println(a.getOb().getY());
		 */
		System.out.println(a.getFriends());
		System.out.println(a.getFeeStructure().getClass().getName());
		System.out.println(a.getFeeStructure());
		System.out.println(a.getProps());
	}

}
