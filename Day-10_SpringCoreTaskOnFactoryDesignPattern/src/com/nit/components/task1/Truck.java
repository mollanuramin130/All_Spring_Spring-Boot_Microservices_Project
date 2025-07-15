package com.nit.components.task1;

public class Truck implements Vehicle {
	private String engineType;
	private double payloadCapacity =2;
	
	
	public Truck(String engineType) {
		super();
		this.engineType = engineType;
	}


	@Override
	public String getDescription() {
		return "Vehicle Type: Truck\n"+
	"Truck Engine Type: "+this.engineType
				+"\nPayload Capacity: "+this.payloadCapacity;
	}

}
