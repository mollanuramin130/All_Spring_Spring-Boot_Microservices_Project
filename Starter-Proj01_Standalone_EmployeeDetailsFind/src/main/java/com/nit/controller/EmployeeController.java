package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.Employee;
import com.nit.service.IEmployeeService;

@Controller("controller")
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;
	
	public List<Employee> getEmployeeDesg(String desg1,String desg2,String desg3) throws Exception{
		return employeeService.getEmployeesDesg(desg1, desg2, desg3);
	}
}
