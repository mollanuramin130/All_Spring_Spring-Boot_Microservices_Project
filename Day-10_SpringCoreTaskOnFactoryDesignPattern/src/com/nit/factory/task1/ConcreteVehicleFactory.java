package com.nit.factory.task1;

import org.springframework.stereotype.Component;

import com.nit.components.task1.Car;
import com.nit.components.task1.Motorcycle;
import com.nit.components.task1.Truck;
import com.nit.components.task1.Vehicle;

@Component("concreteVehicleFactory")
public class ConcreteVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle createVehicle(String type, String engineType) {
		if(type.compareToIgnoreCase("car")==0) {
			return new Car(engineType);
		}else if(type.compareToIgnoreCase("truck")==0) {
			return new Truck(engineType);
		}else if(type.compareToIgnoreCase("motorcycle")==0) {
			return new Motorcycle(engineType);
		}else {
			throw new IllegalArgumentException("Please Provide Valid Engine Type!!");
		}
		
	}

}
