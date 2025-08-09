package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.BookService;

public class MainApp {
	public static void main(String[] args) {
		try(
				AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
				){
			BookService bookService = context.getBean("bookService",BookService.class);
			bookService.libraryService();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
