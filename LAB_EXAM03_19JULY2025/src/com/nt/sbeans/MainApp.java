package com.nt.sbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(AppConfig.class);
		GreetingController greetingController = context.getBean("greetingController",GreetingController.class);
		greetingController.sendMessage("Nur");
	}
}
