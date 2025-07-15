package com.nt.main.problem2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.sbeans.problem2.Car;

@ComponentScan({"com.nt.sbeans.problem2"})
public class Main {
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext cxt=new AnnotationConfigApplicationContext(Main.class);){
			Car car = cxt.getBean("car",Car.class);
			car.drive();
		}
	}
	
}
