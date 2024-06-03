package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/constructorInjection/ciConfig.xml");

		Person p1 = (Person) context.getBean("PersonBean");

		System.out.println(p1); //Pratiksha : 12 {SSL Certificate}

	}
}
