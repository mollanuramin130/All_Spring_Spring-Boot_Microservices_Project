package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.DiscountCalculator;

public class DependencyInjectionMain3 {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext cxt=new FileSystemXmlApplicationContext("/src/com/nt/cfgs/applicationContext3.xml");
		
		DiscountCalculator obj=(DiscountCalculator) cxt.getBean("discountCal");
		
		System.out.println(obj.calculateDiscount());
	}
}
