package com.university;

import org.springframework.stereotype.Component;

@Component("book")
public class Book {
	public String getTitle() {
		return "Spring in Action";
	}
}
