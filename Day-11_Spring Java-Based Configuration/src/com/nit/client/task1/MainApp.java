package com.nit.client.task1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.task1.AppConfig;
import com.nit.service.task1.Student;
import com.nit.service.task1.University;

public class MainApp {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext cxt=new
				AnnotationConfigApplicationContext(AppConfig.class);
				){
			
			Student student = cxt.getBean(Student.class);
			System.out.println(student);
			
//			University university = cxt.getBean("university",University.class);
//			System.out.println(university.getUniversityName());
		}
		
	}
}
