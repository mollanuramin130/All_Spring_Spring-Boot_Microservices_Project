package com.nt.main.problem1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.sbeans.problem1.Laucher;

@ComponentScan(basePackages="com.nt.sbeans")
public class Main {
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(Main.class);
				){
			
			Laucher bean = cxt.getBean("laucher",Laucher.class);
			
			bean.launch();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
