package com.nt.sbeans.problem1;

import org.springframework.stereotype.Component;

@Component
public class Rocket {
	public void ignite(String fuelType) {
		if (isfuel(fuelType)) {
			System.out.println("Rocket ignited!!");
		}else {
			System.out.println("Rocket ignite Fail due to fuel not Full!! ");
		}
	}
	
	public boolean isfuel(String fuelType) {
		if(fuelType.compareToIgnoreCase("full")==0) {
			return true;
		}else {
			return false;
		}
	}
}
