package com.nt.main.question1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.implimentation.beans.Student;

public class StudentMarksUser {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt=new 
				ClassPathXmlApplicationContext("com/configuration/commons/application-context.xml");
		Student bean1 = cxt.getBean("result1",Student.class);
		
		System.out.println(bean1);
		
		System.out.println("\n====================================\n");
		Student bean2 = cxt.getBean("result2",Student.class);
		
		System.out.println(bean2);
	}
}
