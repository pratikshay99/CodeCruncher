package com.springcore.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class DIApp {
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/springcore/di/DIConfig.xml");
		// Object stud1 = ac.getBean("s1"); //Student [studentID=12, studName=null]
		Student stud1 = (Student) ac.getBean("s1"); // Student [studentID=12, studName=null]
		System.out.println(stud1);
		
		Student student2 = (Student) ac.getBean("s2"); // Student [studentID=123, studName=Pratiksha]
		System.out.println(student2);
		
		Student s3 = (Student) ac.getBean("s3"); // Student [studentID=34, studName=Pratu]
		System.out.println(s3);
		
		Student ob4 = (Student) ac.getBean("s4"); // Student [studentID=4, studName=Pratuuu]
		System.out.println(ob4);
	}
}
