package com.nt.sbeans2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("appRunner")
public class AppRunner {
	private Service service;
	
	@Autowired
	public AppRunner(@Qualifier("orderService") Service service) {
		// TODO Auto-generated constructor stub
		this.service=service;
	}
	
	public void invokeService() {
		service.service();
	}
}
