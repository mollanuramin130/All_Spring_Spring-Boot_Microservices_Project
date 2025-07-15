package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.DatePrinter;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionMain2 {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext cxt=new FileSystemXmlApplicationContext("/src/com/nt/cfgs/applicationContext2.xml");
		
		WishMessageGenerator obj=(WishMessageGenerator) cxt.getBean("wmg2");
		
		System.out.println(obj.generateWishMessage());
	}
}
