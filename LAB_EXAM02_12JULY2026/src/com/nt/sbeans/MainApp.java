package com.nt.sbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;

public class MainApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context =new 
				AnnotationConfigApplicationContext(AppConfig.class);){
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
