package com.organization.inheritance.single;

public class TestSingleInheritance {
	public static void main(String[] args) {
		
		Parent obj = new Child();
		
//		Parent obj = new Parent();
		
		obj.a = 10;
		obj.b = 45;
		
		obj.printHello();
//			obj.printHi();
		
		System.out.println("a is : "+obj.a);
		System.out.println("b is : "+obj.b);
	}

}
