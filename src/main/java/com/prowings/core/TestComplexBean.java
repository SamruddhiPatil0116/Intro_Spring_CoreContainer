package com.prowings.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComplexBean {
    public static void main(String[] args) {
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person1 person = (Person1) context.getBean("person1");
        System.out.println(person);
    }
}
