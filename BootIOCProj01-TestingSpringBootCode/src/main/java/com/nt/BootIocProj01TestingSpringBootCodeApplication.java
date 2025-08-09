package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WeekDayFinder;

@SpringBootApplication
public class BootIocProj01TestingSpringBootCodeApplication {

    @Bean(name = "ldt")
    LocalDateTime assiDateTime() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(BootIocProj01TestingSpringBootCodeApplication.class, args);){
			
			WeekDayFinder weekDayFinder = context.getBean("wdf",WeekDayFinder.class);
			System.out.println("\nToday is: "+weekDayFinder.showDayOfWeek());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
