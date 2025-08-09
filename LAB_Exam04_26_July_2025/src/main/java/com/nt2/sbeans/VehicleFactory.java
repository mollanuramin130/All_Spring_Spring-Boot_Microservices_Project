package com.nt2.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vFactory")
public class VehicleFactory {
	@Autowired
	@Qualifier("vehicleType")
	private Vehicle vehicle;
	
	public void startEngine() {
		vehicle.start();
	}
	
	public void stopEngine() {
		vehicle.stop();
	}
}
