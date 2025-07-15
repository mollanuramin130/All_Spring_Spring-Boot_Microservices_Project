package com.nt.sbeans;

public class NotificationService {
	private String notificationService;

	public NotificationService() {
		super();
	}

	public String getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(String notificationService) {
		System.out.println("Notification Set Via Setter Injection");
		this.notificationService = notificationService;
	}

	@Override
	public String toString() {
		return "NotificationService [notificationService=" + notificationService + "]";
	}
	
	
}
