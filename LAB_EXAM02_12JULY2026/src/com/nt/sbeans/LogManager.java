package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LogManager {
	
	private FileLogWriter fileLogWriter;
	
	@Autowired
	public void setFileLogWriter(FileLogWriter fileLogWriter) {
		this.fileLogWriter = fileLogWriter;
		System.out.println("Setter Injection Done Successfully..");
	}
	
	
	
}
