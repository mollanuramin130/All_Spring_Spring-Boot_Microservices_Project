package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bookService")
public class BookService {
	@Autowired
	@Qualifier("library")
	private Library library;
	
	public void libraryService() {
		System.out.println("Every think Fine ");
		System.out.println(library.toString());
	}
}
