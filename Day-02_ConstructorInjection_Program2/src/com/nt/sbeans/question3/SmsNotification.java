package com.nt.sbeans.question3;

public class SmsNotification implements NotificationService{
	@Override
	public void sendingMessage() {
		System.out.println("SmsNotification service Process Successfully....");
	}
}
