package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@PropertySource("com/nt/commons/myfile.properties")
@Component("momCheck")
public class MajorOrMinorCheck {
	@Value("${cust.id}")
	private int id;
	@Value("${cust.name}")
	private String name;
	@Value("${cust.age}")
	private int age;
	
	public MajorOrMinorCheck() {
		System.out.println("MajorOrMinorCheck:: 0-param constructor");
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("MajorOrMinorCheck.myInit()");
		if(age<0 || age>120) {
			throw new IllegalArgumentException("Invalid Age");
		}
		if(name == null || name.isEmpty()   ||name=="") {
			throw new IllegalArgumentException("Invalid Name");
		}
	}
	@Autowired
	@Value("100")
	public void setAge(int age) {
		System.out.println("MajorOrMinorCheck.setAge(-)"+ age);
		this.age = age;
	}
	
	public void myBusinessLogic() {
		System.out.println("MajorOrMinorCheck.myBusinessLogic()");
		if(age < 18) {
			System.out.println(name + " is a minor with age of " + age);
		}
		else {
			System.out.println(name + " is a major with age of " + age);
		}
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("MajorOrMinorCheck.myDestroy()");
		
	}
	
}
