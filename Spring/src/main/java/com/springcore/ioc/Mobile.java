package com.springcore.ioc;

public class Mobile {

	public static void main(String[] args) {

		// Creating instance of Sim interface inside main() method
		// with reference to Jio class constructor invocation
		Sim sim = new Jio();

		// Sim sim = new Airtel();
		// Sim sim = new Vodafone();

		sim.calling();
		sim.data();
	}
}