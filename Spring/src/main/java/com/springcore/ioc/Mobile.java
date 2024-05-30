package com.springcore.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		/* Without IOC */
		// Sim sim = new Jio();

		// Sim sim = new Airtel();
		// Sim sim = new Vodafone();

		/* With IOC */

		ApplicationContext ac = new ClassPathXmlApplicationContext("iocConfig.xml");
		Sim sim = ac.getBean("SimCard", Sim.class);
		sim.calling();
		sim.data();
	}
}