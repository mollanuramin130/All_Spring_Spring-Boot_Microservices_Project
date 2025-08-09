package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.model.Employee;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {
	private final static String GET_EMPS_QUERY="SELECT EMPNO, ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?)";
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeesDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list =new ArrayList<Employee>();
		try( Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_EMPS_QUERY);
				){
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try( ResultSet rs = ps.executeQuery();){
				while (rs.next()) {
					Employee emp=new Employee();
					emp.setEmployeeId(rs.getInt(1));
					emp.setEmployeeName(rs.getString(2));
					emp.setDesignation(rs.getString(3));
					emp.setEmployeeSalary(rs.getDouble(4));
					list.add(emp);
				}
			}
			
		}catch (Exception e) {
			throw e;
		}
		
		return list;
	}

}
