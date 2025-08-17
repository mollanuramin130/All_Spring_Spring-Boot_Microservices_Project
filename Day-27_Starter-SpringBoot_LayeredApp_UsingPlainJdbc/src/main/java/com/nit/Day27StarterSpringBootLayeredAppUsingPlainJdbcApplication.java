package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.StudentController;
import com.nit.model.Student;

@SpringBootApplication
public class Day27StarterSpringBootLayeredAppUsingPlainJdbcApplication {

	public static void main(String[] args) {
		try(
				ConfigurableApplicationContext context = SpringApplication.run(Day27StarterSpringBootLayeredAppUsingPlainJdbcApplication.class, args);
				){
			StudentController studentController = context.getBean("controller",StudentController.class);
			Student nur=new Student("Nur", "Java", 89);
			Student raj=new Student("Raj", "Python", 65);
//			studentController.addStudent(nur);
//			studentController.addStudent(raj);
			
			List<Student> viewAllStudent = studentController.viewAllStudent();
			viewAllStudent.stream().forEach(System.out::println);
			
			double averageMarkOfAllStudent = studentController.averageMarkOfAllStudent();
			System.out.println("Average Marks of All Student is: "+averageMarkOfAllStudent);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
