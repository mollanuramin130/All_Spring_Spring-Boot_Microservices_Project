package com.nit.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.nit.model.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private final static String GET_EMPS_QUERY="SELECT EMPID, ENAME,JOB,SAL FROM EMP WHERE ";
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeesDesgs(String desg1, String desg2, String desg3) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
