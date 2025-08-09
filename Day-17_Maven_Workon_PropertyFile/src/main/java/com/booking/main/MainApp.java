package com.booking.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.booking.config.AppConfig;
import com.booking.sbeans.Flight;
import com.booking.sbeans.User;

public class MainApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);){
			Flight flight = context.getBean("flight",Flight.class);
			User user = context.getBean("user",User.class);
			System.out.println(flight);
			System.out.println("=".repeat(90));
			System.out.println(user);
		}
	}
}
