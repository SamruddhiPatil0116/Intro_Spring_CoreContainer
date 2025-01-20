package com.prowings.Manulwiring_And_Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestManualWiring {
	
	public static void main(String[] args) {
		
		System.out.println("Main started!!!");

		ApplicationContext context = new ClassPathXmlApplicationContext("ManualwiringContext.xml");

		Employee e1 = context.getBean("emp", Employee.class);

		System.out.println("Employee Bean - "+e1);
		
		System.out.println("Main ended!!!");
		
	}

}