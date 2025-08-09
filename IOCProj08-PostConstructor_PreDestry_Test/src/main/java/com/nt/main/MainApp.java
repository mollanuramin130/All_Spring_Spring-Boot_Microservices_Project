package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.MajorOrMinorCheck;

public class MainApp {
	public static void main(String[] args) {
		try(
				AnnotationConfigApplicationContext ctx = 
						new AnnotationConfigApplicationContext(AppConfig.class);
				){
//			ctx.getBean("momCheck", MajorOrMinorCheck.class).myBusinessLogic();
			MajorOrMinorCheck majorOrMinorCheck = ctx.getBean("momCheck",MajorOrMinorCheck.class);
//			majorOrMinorCheck.myBusinessLogic();
			majorOrMinorCheck.setAge(-20); // This will invoke the setter method
			majorOrMinorCheck.myBusinessLogic(); // This will use the age set by the setter method
			ctx.close(); // This will trigger @PreDestroy method
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
