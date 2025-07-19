package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.CurrierProcess;

public class MainApp {
	public static void main(String[] args) {
		try(
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(AppConfig.class);
		){
			
			CurrierProcess currierProcess = context.getBean("currierProcess",CurrierProcess.class);
			currierProcess.delivery();
			
//			String[] beanDefinitionNames = context.getBeanDefinitionNames();
//			for(String str : beanDefinitionNames) {
//				
//				System.out.println(str);
//			}
		}
	}
}
