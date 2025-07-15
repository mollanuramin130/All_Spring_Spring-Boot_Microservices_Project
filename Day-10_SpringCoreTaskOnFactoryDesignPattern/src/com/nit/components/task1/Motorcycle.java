package com.nit.components.task1;

public class Motorcycle implements Vehicle {
	private String engineType;
	private boolean sidecar =true;
	
	
	public Motorcycle(String engineType) {
		super();
		this.engineType = engineType;
	}



	@Override
	public String getDescription() {
		return "Vehicle Type: Motorcycle\n"+"Motorcycle Engine Type: "+this.engineType
				+"\nSidecar Available: "+this.sidecar;
	}

}
