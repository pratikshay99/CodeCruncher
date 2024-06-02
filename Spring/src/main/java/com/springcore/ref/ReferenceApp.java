package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceApp {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		A aref = (A) ac.getBean("aBean");
		System.out.println("ax value from A : " + aref.getAx());
		System.out.println("Value of by from A: aref.getbObjinA(): " + aref.getbObjinA());
		System.out.println("Value of by from B's object: aref.getbObjinA().getBy(): " + aref.getbObjinA().getBy());
		
//output:
//		ax value from A : 0
//		Value of by from A: aref.getbObjinA(): B [by=90]
//		Value of by from B's object: aref.getbObjinA().getBy(): 90
	}
}
