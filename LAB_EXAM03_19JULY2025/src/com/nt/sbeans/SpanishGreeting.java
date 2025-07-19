package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("spanishGreeting")
public class SpanishGreeting implements GreetingService {

	@Override
	public void sendingGreting(String name) {
		System.out.println("Hello Mr."+name+" Sending Spanish Greting to The user...");

	}

}
