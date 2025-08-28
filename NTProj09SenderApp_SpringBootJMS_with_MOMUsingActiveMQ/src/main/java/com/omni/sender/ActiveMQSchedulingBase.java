package com.omni.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQSchedulingBase {
	@Autowired
	private JmsTemplate template;
	
	@Scheduled(cron = "${schedul.cron}")
	public void schedulingTask() {
		template.send("testMQ1",
				session -> session.createTextMessage("Sender Send the Message at time: " + new Date()));

		System.out.println("Message send Successfully..");
	}
}
