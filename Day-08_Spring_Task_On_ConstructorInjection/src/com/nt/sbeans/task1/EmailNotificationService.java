package com.nt.sbeans.task1;

import org.springframework.stereotype.Component;

@Component("emailNotification")
public class EmailNotificationService implements NotificationService {

	@Override
	public void sendMessage() {
		System.out.println("Sending Notification Through Email!!!!");
	}

}
