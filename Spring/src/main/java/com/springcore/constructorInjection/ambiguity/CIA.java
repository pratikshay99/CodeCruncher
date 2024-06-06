package com.springcore.constructorInjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CIA {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/constructorInjection/ambiguity/ciAConfig.xml");

		Addition add = (Addition) context.getBean("additionBean");

		add.doSum();
	}
}
