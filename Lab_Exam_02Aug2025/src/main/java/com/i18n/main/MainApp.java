package com.i18n.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

import com.i18n.config.AppConfig;

public class MainApp {
	public static void main(String[] args) {
		try(
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
				Scanner sc = new Scanner(System.in);
				){
			System.out.print("Enter language code (en/es/fr):");
			String lang=sc.nextLine();
			Locale locale=new Locale(lang);
			
			ResourceBundleMessageSource messageSource = context.getBean("rbms",ResourceBundleMessageSource.class);
			String message = messageSource.getMessage("welcome.message", null, locale);
			System.out.println(message);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
