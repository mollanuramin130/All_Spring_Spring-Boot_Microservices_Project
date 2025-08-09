package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.EmployeeController;
import com.nit.model.Employee;

@SpringBootApplication
public class StarterProj01StandaloneEmployeeDetailsFindApplication {

	public static void main(String[] args) {
		try( ConfigurableApplicationContext context= SpringApplication.run(StarterProj01StandaloneEmployeeDetailsFindApplication.class, args);){
			EmployeeController employeeController = context.getBean("controller",EmployeeController.class);
			List<Employee> employeeDesg = employeeController.getEmployeeDesg("CLERK", "SALESMAN", "MANAGER");
			employeeDesg.stream().forEach(System.out::println);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
