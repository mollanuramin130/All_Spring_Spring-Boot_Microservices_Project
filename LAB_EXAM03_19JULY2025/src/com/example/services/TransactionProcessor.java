package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TransactionProcessor {
	@Autowired
	@Qualifier("paymentService")
	private Service service;
	
	public void serviceExecute() {
		service.serviceMode();
	}
	
}
