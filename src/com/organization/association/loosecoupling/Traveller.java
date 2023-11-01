package com.organization.association.loosecoupling;

public class Traveller {
	
	
	
	Vehicle vehicle;
	
	public Traveller() {
		super();
	}
	
	public Traveller(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	
	
	
	public void startJourney() {
		vehicle.start();
		System.out.println("Journey Started..!!");
	}
}
