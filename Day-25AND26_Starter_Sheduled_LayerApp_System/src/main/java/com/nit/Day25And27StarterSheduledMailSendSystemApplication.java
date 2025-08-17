package com.nit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling //To enable scheduling in the application
public class Day25And27StarterSheduledMailSendSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day25And27StarterSheduledMailSendSystemApplication.class, args);
	}
	
//	@Scheduled(cron = "0 0 10 * * *") //This method will be executed every day at 10 AM
//	@Scheduled(cron="0 58 13 * * *")
//	@Scheduled(fixedRate = 5000)
	@Scheduled(cron ="0 30 10 ? * ?")
	public void schedulingTask() {
		System.out.println("Now Time is: "+ new Date());
	}

}
