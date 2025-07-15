package com.nt.client.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.task2.AppConfig;
import com.nt.sbeans.task2.ReportGenerator;
import com.nt.sbeans.task2.ReportService;

public class MainApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context=new 
				AnnotationConfigApplicationContext(AppConfig.class);){
			ReportGenerator reportGenerator = context.getBean(ReportGenerator.class);
			reportGenerator.generateReport();
		}
		
		
	}
}
