package com.example.services;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public interface MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		TransactionProcessor transactionProcessor = context.getBean(TransactionProcessor.class);
		transactionProcessor.serviceExecute();
	}
}
