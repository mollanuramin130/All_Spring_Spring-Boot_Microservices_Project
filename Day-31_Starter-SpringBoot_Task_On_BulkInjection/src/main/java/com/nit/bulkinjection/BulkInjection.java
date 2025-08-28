package com.nit.bulkinjection;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "ssn.emp")
@Component("bulk")
//@ToString
public class BulkInjection {
	private String name;
	private int age;
	private String address;
	
	@Value("${nit.ins.insname}")
	private String insName;
	@Value("${nit.ins.address}")
	private String insAddress;
	private String mobileS[];
	private String friendsName[];
	private Map<String, String> phoneDirectory;
}
