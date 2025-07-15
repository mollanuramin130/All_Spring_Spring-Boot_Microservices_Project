package com.nt.sbeans.task1;

import org.springframework.stereotype.Component;

@Component("smsNotification")
public class SmsNotificationService implements NotificationService {

	@Override
	public void sendMessage() {
		System.out.println("Sending Notification Through SMS!!!!");

	}

}
