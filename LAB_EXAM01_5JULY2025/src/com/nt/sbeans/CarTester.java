package com.nt.sbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTester {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt=new 
				ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Car bean = cxt.getBean("car",Car.class);
		bean.drive();
	}
}
