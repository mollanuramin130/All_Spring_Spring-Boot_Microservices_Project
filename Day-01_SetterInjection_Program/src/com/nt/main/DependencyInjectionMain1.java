package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.DatePrinter;

public class DependencyInjectionMain1 {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext cxt=new FileSystemXmlApplicationContext("/src/com/nt/cfgs/applicationContext1.xml");
		
		DatePrinter obj=(DatePrinter) cxt.getBean("datePrinter");
		
		System.out.println("Current Date: "+obj.printDate());
		cxt.close();
	}
}
