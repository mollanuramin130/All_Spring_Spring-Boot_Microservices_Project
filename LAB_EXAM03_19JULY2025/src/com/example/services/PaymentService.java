package com.example.services;

import org.springframework.stereotype.Component;

@Component
public class PaymentService implements Service{

	@Override
	public void serviceMode() {
		System.out.println("Dear User Payment Service Mode Executed Successfully....");
		
	}

}
