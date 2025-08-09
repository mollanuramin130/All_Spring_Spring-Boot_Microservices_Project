package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

import com.nt.config.AppConfig;

public class SpringI18nTest {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
				Scanner sc =new Scanner(System.in);
				){
			System.out.print("Enter your Language Code: ");
			String lang=sc.next();
			System.out.print("Enter your Country code: ");
			String countryCode=sc.next();
			Locale locale=new Locale(lang, countryCode);
			
			ResourceBundleMessageSource messageSource = context.getBean("messageSource", org.springframework.context.support.ResourceBundleMessageSource.class);
			String message = messageSource.getMessage("wish.message",null, locale);
			System.out.println("Nur : "+message);
			
			String mgm1=context.getMessage("wish.message", new Object[] {}, "Message1", locale);
			String mgm2=context.getMessage("goodbye.message", new Object[] {}, "Message2", locale);
			String mgm3=context.getMessage("caring.message", new Object[] {}, "Message3", locale);
			String mgm4=context.getMessage("angry.message", new Object[] {"Nur"}, "Message4", locale);
			String mgm5=context.getMessage("sad.message", new Object[] {}, "Message5", locale);
			
			System.out.println(mgm1+"\n"+mgm2+"\n"+mgm3+"\n"+mgm4+"\n"+mgm5);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
