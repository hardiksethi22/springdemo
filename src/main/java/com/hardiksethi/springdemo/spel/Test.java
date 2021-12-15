package com.hardiksethi.springdemo.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/hardiksethi/springdemo/spel/stereoConfig.xml");
		Student a = context.getBean("student",Student.class);
		System.out.println(a);
	}

}
