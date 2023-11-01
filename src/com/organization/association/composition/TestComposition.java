package com.organization.association.composition;

public class TestComposition {

	public static void main(String[] args) {
		
		Engine engine = new Engine("V12", true, false);
		
		Car car = new Car("Audi", 2023, engine);
		
		car.startJourney();
	}
}
