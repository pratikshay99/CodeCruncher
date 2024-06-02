package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsApp {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/collections/CollectionsConfig.xml");
		Emp e1 = (Emp) ac.getBean("collectionBean");
		System.out.println(e1); // Emp [name=Radhe, phones=[7654321, 4654, null], addresses=[Satara, Pune],
								// courses={Java=2months, c=1month}]
		System.out.println("String: " + e1.getName());
		System.out.println("List: " + e1.getPhones());
		System.out.println("Set: " + e1.getAddresses());
		System.out.println("Map: " + e1.getCourses());
	}
}
