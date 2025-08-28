package com.omni.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiverApp {
	@JmsListener(destination = "testMQ1")
	public void readMessage(String text) {
		System.out.println("Receiver text : "+text);
	}
}
