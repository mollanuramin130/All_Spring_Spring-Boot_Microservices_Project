package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig2;
import com.university.Library;

public class UniversityMainApp {
	public static void main(String[] args) {
		try(
				AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig2.class);
				){
			Library library = context.getBean(Library.class);
			
			library.showBook();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
