package com.nt.main.question1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.implimentation.beans.OrderCake;

public class CakeOrderApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt=new 
				ClassPathXmlApplicationContext("com/configuration/commons/application-context.xml");
		
		OrderCake bean = cxt.getBean("dOrderCake",OrderCake.class);
		System.out.println(bean.getOrder());
		
		System.out.println("==============================\n");
		OrderCake bean2 = cxt.getBean("pOrderCake",OrderCake.class);
		System.out.println(bean2.getOrder());
		
		System.out.println("==============================\n");
		OrderCake bean3 = cxt.getBean("pOrderCakeWm",OrderCake.class);
		System.out.println(bean3.getOrder());
	}
}
