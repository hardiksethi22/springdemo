package com.hardiksethi.springdemo.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/hardiksethi/springdemo/autowire/autowireConfig.xml");

		
		Employee e1 = (Employee)context.getBean("Employee");
		System.out.println(e1);
	}
}
