package com.nt.client.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.task1.AppConfig;
import com.nt.sbeans.task1.Notifier;

public class MainApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context=new 
				AnnotationConfigApplicationContext(AppConfig.class);){
			Notifier notifier = context.getBean(Notifier.class);
			notifier.sendNotification();
		}
		
		
	}
}
