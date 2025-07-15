package com.nt.sbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ElectricCarTester {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt=new 
				ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext2.xml");
		
		ElectricCar bean = cxt.getBean("electricCar",ElectricCar.class);
		bean.drive();
	}
}
