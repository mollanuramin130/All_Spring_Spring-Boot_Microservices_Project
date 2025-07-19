package com.example.services;

import org.springframework.stereotype.Component;

@Component
public class NotificationService implements Service{

	@Override
	public void serviceMode() {
		System.out.println("Dear User Notification Service Mode Executed Successfully....");		
	}

}
