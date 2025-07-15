package com.nt.main.problem1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.task.springCore.problem1.Account;

public class Tester {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt= new
				ClassPathXmlApplicationContext("com/bd/commons/problem1/application05-context.xml");
		
		Account account=cxt.getBean("account",Account.class);
		
		System.out.println("After getting the object");
		System.out.println(account);
		
		System.out.println("\nAfter deposite ");
		account.deposit(4000);
		System.out.println(account);
		
		System.out.println("\nAfter withdraw");
		account.withdraw(2000);
		System.out.println(account);
	}
}
