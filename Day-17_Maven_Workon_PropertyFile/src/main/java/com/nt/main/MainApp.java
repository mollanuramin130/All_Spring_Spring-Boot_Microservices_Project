package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.PlayerService;

public class MainApp {
	public static void main(String[] args) {
		try(
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);){
			
			PlayerService playerService = context.getBean("playerService",PlayerService.class);
			playerService.displayPlayerInfo();
		}
	}
}
