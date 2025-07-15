package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private Department department;
	
	private Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public Employee(@Qualifier("dept") Department department) {
		super();
		this.department = department;
		System.out.println("In Employee Class Department Object Set by Constructor Injection...");

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

}
