package com.nt.sbeans.task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig3;

public class MainApp3 {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context =new 
				AnnotationConfigApplicationContext(AppConfig3.class);){
			
			NotificationSystem notificationSystem = context.getBean("notification",NotificationSystem.class);
			notificationSystem.sendNotification();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
