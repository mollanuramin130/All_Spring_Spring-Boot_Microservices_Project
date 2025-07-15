package com.nt.main.question1;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.question1.CyclicDI_A;

public class CyclicDITestorMain {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/question1/applicationContext.xml");
		
		CyclicDI_A cdia=(CyclicDI_A) ctx.getBean("cdia");
		cdia.checkValue();
	}
}
