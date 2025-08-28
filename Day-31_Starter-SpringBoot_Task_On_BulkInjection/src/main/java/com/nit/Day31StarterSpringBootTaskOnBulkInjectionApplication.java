package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.bulkinjection.BulkInjection;

@SpringBootApplication
public class Day31StarterSpringBootTaskOnBulkInjectionApplication {

	public static void main(String[] args) {
		try(
				ConfigurableApplicationContext context = SpringApplication.run(Day31StarterSpringBootTaskOnBulkInjectionApplication.class, args);
				){
			BulkInjection bulkInjection = context.getBean("bulk",BulkInjection.class);
			System.out.println(bulkInjection);
		}
	}

}
