package com.nt.sbeans2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppRunner appRunner = context.getBean("appRunner",AppRunner.class);
		appRunner.invokeService();
	}
}
