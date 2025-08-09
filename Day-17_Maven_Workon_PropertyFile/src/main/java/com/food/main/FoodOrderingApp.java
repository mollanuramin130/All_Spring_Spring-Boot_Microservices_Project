package com.food.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.food.config.AppConfig;
import com.food.sbeans.FoodService;

public class FoodOrderingApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
				){
			FoodService foodService = context.getBean("foodService",FoodService.class);
			foodService.displayFoodInfo();
		}
	}
}
