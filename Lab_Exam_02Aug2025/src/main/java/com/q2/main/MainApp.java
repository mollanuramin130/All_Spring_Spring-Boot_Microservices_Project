package com.q2.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.q2.config.AppConfig;
import com.q2.sbeans.UserProfile;

public class MainApp {
	public static void main(String[] args) {
		try(
				AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
				){
			UserProfile userProfile = context.getBean("userProfile",UserProfile.class);
			
			System.out.println(userProfile);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
