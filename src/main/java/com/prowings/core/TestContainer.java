package com.prowings.core;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestContainer {
	
	public static void main(String[] args) {
		
//		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student s1 = context.getBean(Student.class);
		System.out.println("ApplicationContext bean :"+s1);

		
		Employee e1 = context.getBean(Employee.class);
		System.out.println("ApplicationContext 2 bean :"+e1);
	}

}
