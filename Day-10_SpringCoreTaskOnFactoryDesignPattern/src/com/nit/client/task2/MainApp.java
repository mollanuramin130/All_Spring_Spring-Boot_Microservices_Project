package com.nit.client.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.task1.AppConfig;
import com.nit.factory.task1.VehicleService;
import com.nit.factory.task2.Customer;

public class MainApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);){
			Customer customer= context.getBean("customer",Customer.class);
			
			customer.setCustomerId(101);
			customer.setCustomerName("Nur Amin");
			customer.setBank("SBI");
			
			customer.deposit(2000);
			customer.displayDetails();
			customer.withdraw(150);
			customer.withdraw(15000);
			customer.displayDetails();
		}
	}
}
