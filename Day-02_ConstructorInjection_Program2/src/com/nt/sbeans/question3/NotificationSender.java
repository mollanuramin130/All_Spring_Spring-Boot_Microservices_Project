package com.nt.sbeans.question3;

public class NotificationSender {
	private NotificationService notificationService;
	
	public NotificationSender(NotificationService notificationService) {
		this.notificationService=notificationService;
	}
	
	public void notificationSendProcess() {
		notificationService.sendingMessage();
	}
}
