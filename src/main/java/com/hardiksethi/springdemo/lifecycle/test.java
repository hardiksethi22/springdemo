package com.hardiksethi.springdemo.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/hardiksethi/springdemo/lifecycle/ciConfig.xml");
		
		context.registerShutdownHook();
		/*
		 * A a11 = (A)context.getBean("a1"); System.out.println(a11);
		 * 
		 * 
		 * 
		 * B b1 = (B)context.getBean("b1"); System.out.println(b1);
		 */
		
		Example e1 = (Example)context.getBean("e1");
		System.out.println(e1);
	}
}
