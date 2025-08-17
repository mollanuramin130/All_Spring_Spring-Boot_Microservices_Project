package com.nit;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.StudentController;
import com.nit.model.Student;

@SpringBootApplication
public class Day29StarterLayerProjectCrudOperationApplication {

	public static void main(String[] args) {
		try(
				ConfigurableApplicationContext context = SpringApplication.run(Day29StarterLayerProjectCrudOperationApplication.class, args);
				){
			StudentController studentController = context.getBean("studentController", StudentController.class);
			Student student = new Student("Nur Amin", "nur@gmail.com", "Java", LocalDate.now());
			
			// Insert a new student
			studentController.studentInsert(student);
			// View all students
			System.out.println("All Students: " + studentController.viewAllStudent());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
