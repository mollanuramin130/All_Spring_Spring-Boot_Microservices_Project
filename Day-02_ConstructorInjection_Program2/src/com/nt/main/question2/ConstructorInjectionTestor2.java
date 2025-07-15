package com.nt.main.question2;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.question2.WishMessageGenerator;

public class ConstructorInjectionTestor2 {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext cxt=
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/question2/applicationContext.xml");
		WishMessageGenerator wmg =(WishMessageGenerator) cxt.getBean("wmg");
		
		String wishMessage = wmg.generateWishMessage();
		System.out.println(wishMessage);
		
	}
}
