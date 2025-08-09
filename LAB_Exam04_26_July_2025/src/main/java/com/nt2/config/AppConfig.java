package com.nt2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.nt2.sbeans.Car;
import com.nt2.sbeans.Truck;
import com.nt2.sbeans.Vehicle;

@Configuration
@PropertySource("com/nt2/commons/vehicle.properties")
@ComponentScan("com.nt2.sbeans")
public class AppConfig {
	@Value("${vehicle.type}")
	private String vehicleType;
	
	@Bean("vehicleType")
	public Vehicle assignVehicle() {
		if(vehicleType.compareToIgnoreCase("car")==0) {
			return new Car();
		}else if(vehicleType.compareToIgnoreCase("truck")==0){
			return new Truck();
		}else {
			throw new IllegalArgumentException("Invalid Car type..");
		}
	}
}
