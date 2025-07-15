package com.nt.main.question3;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.question3.NotificationSender;

public class ConstructorInjectionTestor3 {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext cxt=
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/question3/applicationContext.xml");
		NotificationSender obj=(NotificationSender) cxt.getBean("notificationSender");
		obj.notificationSendProcess();
	}
}
