package com.nt.sbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig2;

public class MainApp2 {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context =new 
				AnnotationConfigApplicationContext(AppConfig2.class);){
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
