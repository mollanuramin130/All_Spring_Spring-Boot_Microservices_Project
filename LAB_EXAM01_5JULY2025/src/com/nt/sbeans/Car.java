package com.nt.sbeans;

public class Car {
	private Engine engine;
	
	private String carName;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public void drive() {
		System.out.println("Car name: "+carName+"\nHourse Power: "+engine.getHoursePower()+
				"\nRunning on Road......");
	}
}
