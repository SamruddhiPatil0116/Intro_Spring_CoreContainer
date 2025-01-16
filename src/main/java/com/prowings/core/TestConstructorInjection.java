package com.prowings.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInjection {
	
	public static void main(String[] args) {
		System.out.println("main started!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*
		 * Car c1 = context.getBean("car1", Car.class);
		 * System.out.println("Car Bean --> "+c1);
		 */
		
		Order o1 = context.getBean("order1", Order.class);
		System.out.println(o1);
		
		System.out.println("main ended!!");
	}

}