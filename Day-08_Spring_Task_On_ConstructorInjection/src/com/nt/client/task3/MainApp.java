package com.nt.client.task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.task3.AppConfig;
import com.nt.sbeans.task3.ShipmentProcessor;

public class MainApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context=new 
				AnnotationConfigApplicationContext(AppConfig.class);){
			ShipmentProcessor shipmentProcessor = context.getBean(ShipmentProcessor.class);
			shipmentProcessor.shipPackage();
		}
		
		
	}
}
