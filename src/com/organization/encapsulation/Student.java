package com.organization.encapsulation;

public class Student {
	
	private String name;
	private int rollNo;
	private static String schoolName = "ABC School";
	
	public Student() {
		super();
	}
	
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Student[rollNo = "+ rollNo +"name = "+ name + "]";
	}
}
