package com.nt2.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt2.config.AppConfig;
import com.nt2.sbeans.VehicleFactory;

public class ClientApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);){
			VehicleFactory vehicleFactory = context.getBean("vFactory",VehicleFactory.class);
			vehicleFactory.startEngine();
			vehicleFactory.stopEngine();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
