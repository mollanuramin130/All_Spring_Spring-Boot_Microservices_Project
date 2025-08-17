package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.mail.SendingMail;

@SpringBootApplication
public class Day28StarterMailingSendSystemApplication {

	public static void main(String[] args) {
		try(
				ConfigurableApplicationContext context = SpringApplication.run(Day28StarterMailingSendSystemApplication.class, args);
				
				){
			SendingMail sendingMail = context.getBean("mail",SendingMail.class);
			try {
//				sendingMail.sendMail();
				System.out.println(sendingMail.sendMail("mollanuramin110@gmail.com"));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
