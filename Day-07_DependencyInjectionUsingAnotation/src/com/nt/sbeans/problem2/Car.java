package com.nt.sbeans.problem2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Below all Component same because by default class name consider as bean id but staring latter start with small latter 

//@Component("car")
//@Component()
@Component
public class Car {
	
	private Engine engine;
	
	@Autowired
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	public void drive() {
		engine.start("petrol", 28, 37);
	}
}
