package com.nt.sbeans.task3;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsSender implements NotificationSender {

	@Override
	public void sendNotification() {
		System.out.println("Send notification through SMS service...");
	}

}
