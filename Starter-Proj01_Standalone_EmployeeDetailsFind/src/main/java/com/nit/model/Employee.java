package com.nit.model;

import lombok.Data;

@Data
public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private String designation;
	private double grossSalary;
	private double netSalary;
	
}
