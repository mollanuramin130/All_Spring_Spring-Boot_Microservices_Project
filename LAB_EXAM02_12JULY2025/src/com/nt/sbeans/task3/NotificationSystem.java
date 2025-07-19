package com.nt.sbeans.task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("notification")
public class NotificationSystem {
	private NotificationSender notificationSender;
	private MessageFormatter messageFormatter ;

	@Autowired
	public NotificationSystem(@Qualifier("sms") NotificationSender notificationSender) {
		super();
		this.notificationSender = notificationSender;
		System.out.println("Notification Sender set via constructor Injection");
	}
	
	
	
	public MessageFormatter getMessageFormatter() {
		return messageFormatter;
	}


	@Autowired
	@Qualifier("messageFormatter")
	public void setMessageFormatter(MessageFormatter messageFormatter) {
		this.messageFormatter = messageFormatter;
		System.out.println("Setter Injection Successfully Execute...");
	}



	public void sendNotification() {
		notificationSender.sendNotification();
	}
	
	
}
