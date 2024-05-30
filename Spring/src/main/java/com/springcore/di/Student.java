package com.springcore.di;

public class Student {

	private int studentID;
	private String studName;

//	If you can't define default constructor then you'll face exception: Instantiation of bean failed; No default constructor found; 
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studName=" + studName + "]";
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}
	
//	// For constructor injection you need below constructor
//	public Student(int studentID, String studName) {
//		super();
//		this.studentID = studentID;
//		this.studName = studName;
//	}

}
