package com.nt.main.problem3;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

import com.nt.sbeans.problem3.Student;

@ComponentScan(basePackages="com.nt.sbeans.problem3")
public class Main {
	@Primary
	@Bean("date")
	public LocalDate setterDate() {
		System.out.println("Main.setterDate()");
		return LocalDate.now();
	}
	@Bean("date2")
	public LocalDate setterDate2() {
		System.out.println("Main.setterDate()");
		return LocalDate.of(2020, 12, 26);
	}
	
	public static void main(String[] args) {
		
		
		try(AnnotationConfigApplicationContext cxt=
				new AnnotationConfigApplicationContext(Main.class);){
			Student bean = cxt.getBean("student",Student.class);
			bean.visitLibrary();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
