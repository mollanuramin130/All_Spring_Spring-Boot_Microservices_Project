package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Employee;
import com.nit.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImp implements IEmployeeMgmtService{
	@Autowired
	private IEmployeeRepo empRepo;

	@Override
	public String registerEmployee(Employee emp) {
		Employee insert = empRepo.insert(emp);
		return insert.getId();
	}

}
