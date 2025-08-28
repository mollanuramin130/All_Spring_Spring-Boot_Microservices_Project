package com.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.model.Employee;
import com.nit.service.IEmployeeMgmtService;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeMgmtService empService;
	@Override
	public void run(String... args) throws Exception {
		Employee emp1=new Employee();
		emp1.setName("Nur Amin");
		emp1.setAddress("West Bengal");
		emp1.setMobile(8926627220L);
		
		String empId = empService.registerEmployee(emp1);
		System.out.println("Employee Register with ID: "+empId);
	}

}
