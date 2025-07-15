package com.nt.main;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.DayTimeFinder;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext cxt=new FileSystemXmlApplicationContext("/src/com/nt/cfgs/applicationContext.xml");
		
		DayTimeFinder dayTimeFinder=cxt.getBean("dayTime",DayTimeFinder.class);
		//dayTimeFinder.checkVal();
		
		System.out.println("\n\n"+dayTimeFinder.dayValue());
	}
}
