package com.nt.main_q2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.component_q2.FoodOrderApp;
import com.nt.config_q2.AppConfig;

public class BillingTester {
	public static void main(String[] args) {
		try(
				AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfig.class);
				){
			FoodOrderApp foodOrderApp = context.getBean(FoodOrderApp.class);
//			foodOrderApp.orderFood("idli");
			foodOrderApp.orderFood("Chicken Biryani");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
