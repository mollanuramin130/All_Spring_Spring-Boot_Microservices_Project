package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonsGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext cxt=new FileSystemXmlApplicationContext("/src/com/nt/cfgs/applicationContext.xml");
		
		Object bean = cxt.getBean("seasons");
		SeasonsGenerator seasonsObj=(SeasonsGenerator)bean;
		
		String seasons = seasonsObj.findSeasons();
		System.out.println("Now Going : "+seasons);
	}
}
