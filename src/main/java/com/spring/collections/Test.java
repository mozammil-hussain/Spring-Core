package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) { 
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collections/ccollections.xml");

		Student s = (Student) context.getBean("employee1");
		
		System.out.println(s);

	}

}
