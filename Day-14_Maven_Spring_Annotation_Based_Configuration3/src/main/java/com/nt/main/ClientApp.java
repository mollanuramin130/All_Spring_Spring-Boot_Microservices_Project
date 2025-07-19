package com.nt.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.MessageConverter;

public class ClientApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(AppConfig.class);
				Scanner sc=new Scanner(System.in);
				) {
			System.out.print("Enter your Message: ");
			String message=sc.nextLine();
			System.out.print("Message Convert type(HTML/PDF): ");
			String type=sc.nextLine();
			MessageConverter messageConverter = context.getBean("messageConverter",MessageConverter.class);
			String converter = messageConverter.messageConverter(type, message);
			System.out.println(converter);
			
		} catch (Exception e) {
			
		}
	}
}
