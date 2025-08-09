package com.nit.service;

import java.util.List;

import com.nit.model.Employee;

public interface IEmployeeService {
	public List<Employee> getEmployeesDesg(String desg1,String desg2,String degs3) throws Exception;
}
