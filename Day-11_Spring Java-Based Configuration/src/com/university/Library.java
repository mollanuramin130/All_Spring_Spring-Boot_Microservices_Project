package com.university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("library")
public class Library {
	private Book book;
	
	@Autowired
	public Library(@Qualifier("book") Book book) {
		super();
		this.book = book;
	}
	
	public void showBook() {
		System.out.println("Library has: "+book.getTitle());
	}
}
