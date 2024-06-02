package com.springcore.ref;

public class A {
	private int ax;
	private B bObjinA;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAx() {
		return ax;
	}

	public void setAx(int ax) {
		this.ax = ax;
	}

	public B getbObjinA() {
		return bObjinA;
	}

	public void setbObjinA(B bObjinA) {
		this.bObjinA = bObjinA;
	}

	@Override
	public String toString() {
		return "A [ax=" + ax + ", bObjinA=" + bObjinA + "]";
	}

}
