package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("greetingController")
public class GreetingController {
	@Autowired
	@Qualifier("spanishGreeting")
	private GreetingService greetingService;
	
	public void sendMessage(String name) {
		greetingService.sendingGreting(name);
	}
}
