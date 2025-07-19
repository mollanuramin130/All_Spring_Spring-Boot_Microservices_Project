package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dept")
public class Department {
	private String name;

	@Autowired
	public Department(@Qualifier("str1") String name) {
		super();
		this.name = name;
		System.out.println("Department Name Set by Constructor Injection..."+name);
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
	
	
	
	
}
