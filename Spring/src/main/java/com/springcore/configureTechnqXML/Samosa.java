package com.springcore.configureTechnqXML;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting values");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	//method name can be different but signature must be same
	//public void hey() {......init 
	public void init() {
		System.out.println("Inside init()");
	}
	
	//public void bye() {
	public void destroy() {
		System.out.println("Inside destroy()");
	}
	
}
