package com.springcore.ioc;

//Class Implementing Sim interface
public class Airtel implements Sim {

	public void calling() {
		System.out.println("Airtel Calling");
	}

	public void data() {
		System.out.println("Airtel Data");
	}
}
