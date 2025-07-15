package com.nt.sbeans.problem2;

import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
	public void start(String fuelType, int temp, int pressure) {
		if(isFuelValid(fuelType) && checkTemp(temp) && tyrePressure(pressure)) {
			System.out.println("Car started successfully!\n"
					+ "Engine started!!!");
		}else {
			System.out.println("Engine failed to start!");
		}
	}
	
	public boolean isFuelValid(String fuelType) {
		return fuelType.compareToIgnoreCase("petrol")==0;
	}
	
	public boolean checkTemp(int temp) {
		return temp<=30;
	}
	
	public boolean tyrePressure(int pressure) {
		return pressure<=40 && pressure>=35;
	}
}
