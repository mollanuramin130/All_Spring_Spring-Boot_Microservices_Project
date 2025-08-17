package com.nit.model;

import lombok.Data;

@Data
public class Actor {
	private int id;
	private String name;
	private String movies;
	
	public void display() {
		System.out.println("Actor Details:\n"
				+ "  ID     : "+id
				+ "\n  Name   : "+name
				+ "\n  Movies : "+movies);
	}
}
