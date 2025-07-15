package com.nit.client.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.task2.AppConfig;
import com.nit.service.task2.VehicleWorkshop;

public class CarMainApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(AppConfig.class);){
			
			VehicleWorkshop vehicleWorkshop = context.getBean(VehicleWorkshop.class);
			vehicleWorkshop.maintenance();
		}
		
	}
}
