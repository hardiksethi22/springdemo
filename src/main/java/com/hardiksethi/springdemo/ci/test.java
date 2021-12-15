package com.hardiksethi.springdemo.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/hardiksethi/springdemo/ci/ciConfig.xml");
		Person emp1 = (Person)context.getBean("Person");
		//System.out.println(emp1);
		addition a = (addition)context.getBean("addition");
		a.doSum();
	}
}
