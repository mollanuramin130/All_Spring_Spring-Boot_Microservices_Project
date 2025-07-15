package com.nit.client.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.task1.AppConfig;
import com.nit.factory.task1.VehicleService;

public class MainApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);){
			VehicleService vehicleService = context.getBean("vehicleService",VehicleService.class);
			
			String description = vehicleService.createVehicle("motorcycle", "electric");
			System.out.println(description);
		}
	}
}
