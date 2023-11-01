package com.organization.encapsulation;

public class TestEncapsulation {
	
	public static void main(String[] args) {
		
		Student s = new Student("Akshay",70);
		
		System.out.println(s.getRollNo());
		System.out.println(s.getName());
		
		s.setRollNo(29);
		s.setName("Sneha");
		
		System.out.println("=============");
		System.out.println(s.getRollNo());
		System.out.println(s.getName());
	}
}
