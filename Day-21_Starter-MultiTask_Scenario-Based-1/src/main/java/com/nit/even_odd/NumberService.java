package com.nit.even_odd;

import org.springframework.stereotype.Component;

@Component("number")
public class NumberService {
	public String checkEvenOdd(int number) {
		return number%2==0?"Even":"Odd";
	}
}
