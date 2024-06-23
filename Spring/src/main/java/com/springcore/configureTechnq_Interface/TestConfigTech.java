package com.springcore.configureTechnq_Interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConfigTech {

	public static void main(String[] args) {
		
		// ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/configureTechnqXML/XMLConfig.xml");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/configureTechnq_Interface/InterfaceConfig.xml");

		System.out.println(context.getBean("s1"));		
		/*O/p: 
		 * setting values 
		 * Inside init() 
		 * Samosa [price=10.0]
		 */
		
		/*
		 * to call destroy method we need to call preshutdownhook, if we can't call
		 * this then destroy method will not invoke, registershutdownhook() is present inside
		 * AbstractApplicationContext package so here we are using
		 * AbstractApplicationContext rather than ApplicationContext
		 */
		
		context.registerShutdownHook(); //to call destroy()
		/*O/p: 
		 * setting values 
		 * Inside init() 
		 * Samosa [price=10.0]
		 * Inside destroy()
		 */
	}

}
