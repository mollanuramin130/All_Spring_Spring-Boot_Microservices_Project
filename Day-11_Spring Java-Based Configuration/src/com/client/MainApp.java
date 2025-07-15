package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.finance.ProfitLoss;

public class MainApp {
	public static void main(String[] args) {
		try(
				AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
				){
			ProfitLoss profitLoss = context.getBean("profitLoss",ProfitLoss.class);
			
			profitLoss.calculateProfit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
