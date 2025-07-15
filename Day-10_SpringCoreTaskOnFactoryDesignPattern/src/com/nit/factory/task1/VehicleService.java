package com.nit.factory.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.components.task1.Vehicle;

@Component("vehicleService")
public class VehicleService {
	@Autowired
	@Qualifier("concreteVehicleFactory")
	private VehicleFactory vehicleFactory;
	
	public String createVehicle(String type, String engineType) {
		Vehicle vehicle = vehicleFactory.createVehicle(type, engineType);
		return vehicle.getDescription();
	}
	
}
