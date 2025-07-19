package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("englishGreeting")
public class EnglishGreeting implements GreetingService{

	@Override
	public void sendingGreting(String name) {
		System.out.println("Hello Mr."+name+" Sending English Greting to The user...");
	}

}
