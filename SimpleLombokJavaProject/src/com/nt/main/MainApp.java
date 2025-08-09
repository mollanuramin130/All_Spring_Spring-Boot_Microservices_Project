package com.nt.main;

import com.nt.test.LombokTest;

public class MainApp {
	public static void main(String[] args) {
		LombokTest obj=new LombokTest("Nur Amin", 25, "Kolkata");
		System.out.println(obj);
		
		obj.setAge(22);
		System.out.println(obj);
	}
}
