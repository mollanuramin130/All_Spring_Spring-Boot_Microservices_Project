package com.nt.sbeans;

public class ElectricCar {
	private String carName;
	private VechileType vechileType;
	
	public ElectricCar(String carName, VechileType vechileType) {
		super();
		this.carName = carName;
		this.vechileType = vechileType;
	}
	
	public void drive() {
		System.out.println("Car : "+carName+"\nVechile Type: "+vechileType.getVechileType()+
				"Vechile Color: "+vechileType.getVechileColor()+
				"\nRun On the Roard....");
	}
}
