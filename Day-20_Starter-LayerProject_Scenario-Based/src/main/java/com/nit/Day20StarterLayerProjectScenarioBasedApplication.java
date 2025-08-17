package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.model.Actor;

@SpringBootApplication
public class Day20StarterLayerProjectScenarioBasedApplication {

	public static void main(String[] args) {
		try(
		ConfigurableApplicationContext context = SpringApplication.run(Day20StarterLayerProjectScenarioBasedApplication.class, args);
				){
			Actor actor = context.getBean(Actor.class);
			actor.display();
		}
	}

}
