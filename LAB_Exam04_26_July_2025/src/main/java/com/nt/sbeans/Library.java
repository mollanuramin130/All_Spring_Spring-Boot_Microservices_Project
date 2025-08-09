package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("library")
public class Library {
	@Autowired
	@Value("${library.name}")
	private String libraryName;
	@Autowired
	@Value("${max.books}")
	private int maxBooks;
	
	
	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", maxBooks=" + maxBooks + "]";
	}
	
	
}
