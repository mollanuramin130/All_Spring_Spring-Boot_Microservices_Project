package com.nit.components.task1;

public class Car implements Vehicle {
	private String engineType;
	private int numberOfDoor=4;
	
	
	
	public Car(String engineType) {
		super();
		this.engineType = engineType;
	}



	@Override
	public String getDescription() {
		
		return "Vehicle Type: Car\n"+"Car Engine Type: "+this.engineType
				+"\nNumber Of Door: "+this.numberOfDoor;
	}

}
