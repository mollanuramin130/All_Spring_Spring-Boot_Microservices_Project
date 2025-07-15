package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class WishMessageTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext context=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

		WishMessageGenerator wmg= (WishMessageGenerator) context.getBean("wmg");
		String resultMessage=wmg.generateMessage("Nur Amin");
		System.out.println(resultMessage);
	}
}
