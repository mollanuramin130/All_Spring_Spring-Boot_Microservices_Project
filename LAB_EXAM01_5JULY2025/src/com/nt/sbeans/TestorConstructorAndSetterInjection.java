package com.nt.sbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestorConstructorAndSetterInjection {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext3.xml");

		NotificationService notification = cxt.getBean("notification", NotificationService.class);
		System.out.println(notification);
		System.out.println("=".repeat(50)+"\n");
		
		UserRepository userRepo = cxt.getBean("userRepo", UserRepository.class);
		System.out.println(userRepo);
	}
}
