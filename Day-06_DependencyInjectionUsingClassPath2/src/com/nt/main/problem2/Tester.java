package com.nt.main.problem2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.task.springCore.problem2.Student;

public class Tester {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cxt= new
				ClassPathXmlApplicationContext("com/bd/commons/problem2/application05-context.xml");
		
		String[] studentIds = {"studentVirat", "studentDhoni", "studentRohit","studentShami"};

        for (String id : studentIds) {
            Student student = (Student) cxt.getBean(id);
            double balance = student.payFee();

            if (balance > 0) {
                System.out.println("Refund amount Rs. ");
                System.out.println("Rs. " + balance);
            } else if (balance < 0) {
                System.out.println("Have to pay more amount of Rs.");
                System.out.println("Rs. " + Math.abs(balance));
            } else {
                System.out.println("All due clear !!");
            }

            System.out.println(student.displayDetails());
            System.out.println("\n"+"=".repeat(80)+"\n\n");
        }
	}
}
