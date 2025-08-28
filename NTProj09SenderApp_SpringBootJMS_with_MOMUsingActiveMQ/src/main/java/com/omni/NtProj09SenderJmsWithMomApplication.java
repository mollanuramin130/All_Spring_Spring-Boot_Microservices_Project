package com.omni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NtProj09SenderJmsWithMomApplication {

	public static void main(String[] args) {
		SpringApplication.run(NtProj09SenderJmsWithMomApplication.class, args);
	}

}
