package com.nt.sbeans.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Notifier {
	NotificationService notificationService;

	@Autowired
	public Notifier(@Qualifier("emailNotification") NotificationService notificationService) {
		super();
		this.notificationService = notificationService;
	}
	
	public void sendNotification() {
		notificationService.sendMessage();
	}
	
	
}
 