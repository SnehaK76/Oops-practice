package com.organization.association.loosecoupling;

public class TestLooseCoupling {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Helicopter();
		
		Traveller traveller = new Traveller(vehicle);
		
		traveller.startJourney();
	}
}
