package com.organization.association.composition;

public class Engine {
	
	String name;
	boolean fuel;
	boolean engineOil;
	
	public Engine() {
		super();
	}
	
	public Engine(String name, boolean fuel, boolean engineOil) {
		super();
		this.name = name;
		this.fuel = fuel;
		this.engineOil = engineOil;
	}
	
	public boolean start() {
		
		if(fuel && engineOil) {
			System.out.println("Engine Started!!");
			return true;
		}else {
			System.out.println("Engine can not start without fuel and engine");
			return false;
		}
		
	}
	
}
