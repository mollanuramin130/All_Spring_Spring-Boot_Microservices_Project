package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.IEmployeeDAO;
import com.nit.model.Employee;

@Service
public class EmployeeServiceImp implements IEmployeeService {
	@Autowired
	private IEmployeeDAO employeeDAO;
	
	//Business Logic
	@Override
	public List<Employee> getEmployeesDesg(String desg1, String desg2, String desg3) throws Exception {
		desg1=desg1.toUpperCase();
		desg2=desg2.toUpperCase();
		desg3=desg3.toUpperCase();
		List<Employee> employeesDesgs = employeeDAO.getEmployeesDesgs(desg1, desg2, desg2);
		
			employeesDesgs.stream().forEach(emp->{
			emp.setGrossSalary(emp.getEmployeeSalary()*12);
			emp.setNetSalary(emp.getGrossSalary()-emp.getEmployeeSalary()*0.05);
		});
		
		//OR
		/*
		for(Employee emp: employeesDesgs) {
			emp.setGrossSalary(emp.getEmployeeSalary()*12);
			emp.setNetSalary(emp.getGrossSalary()-emp.getEmployeeSalary()*0.05);
		}
		*/
		return employeesDesgs;
	}

}
