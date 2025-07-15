package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.ElectricityBillGenerator;

public class DependencyInjectionMain4 {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext cxt=new FileSystemXmlApplicationContext("/src/com/nt/cfgs/applicationContext4.xml");
		
		ElectricityBillGenerator obj=(ElectricityBillGenerator) cxt.getBean("eleBillGen");
		
		System.out.println("Total Electricity Bill: "+obj.generateBill());
	}
}
