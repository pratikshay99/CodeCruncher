package com.springcore.configureTechnq_Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Samosa implements InitializingBean, DisposableBean {
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

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init()/afterPropertiesSet()");
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy()");

	}

}
