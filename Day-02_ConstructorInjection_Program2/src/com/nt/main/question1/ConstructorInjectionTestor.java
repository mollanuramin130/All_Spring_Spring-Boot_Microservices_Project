package com.nt.main.question1;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.question1.PaymentProcessor;

public class ConstructorInjectionTestor {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext cxt =
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/question1/applicationContext.xml");
		
		PaymentProcessor paymentProcessor =(PaymentProcessor) cxt.getBean("paymentProcessor");
		paymentProcessor.makePayment(250);
		
	}
}
