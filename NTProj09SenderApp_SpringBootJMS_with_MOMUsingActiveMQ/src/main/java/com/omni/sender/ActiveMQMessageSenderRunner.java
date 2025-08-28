package com.omni.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessageSenderRunner implements CommandLineRunner {
	@Autowired
	private JmsTemplate template;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		//Using Annonymous Inner Class
		template.send("testMQ1", new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage textMessage = session.createTextMessage("Sender Send the Message at time: "+new Date());
				return textMessage;
			}
		});
		*/
		
		/*
		//Using Lambda Expression
		template.send("testMQ1", session->{
			return session.createTextMessage("Sender Send the Message at time: "+new Date());
		});
		*/
		
		
		//Using Lambda Expression more efficient way
		template.send("testMQ1",session->session.createTextMessage("Sender Send the Message at time: "+new Date()));
		
		System.out.println("Message send Successfully..");
	}
	
	
	

}
