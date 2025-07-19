package com.nt.sbeans.task3;

import org.springframework.stereotype.Component;

@Component("messageFormatter")
public class MessageFormatter {

	public MessageFormatter() {
		super();
		System.out.println("MessageFormatter : 0-Param Constructor Executed Successfully...");
	}
	
}
