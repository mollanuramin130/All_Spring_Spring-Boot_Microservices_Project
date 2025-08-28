package com.nit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "EMP_TABLE")
@Data
public class Employee {
	@Id
	private String id;
	private String name;
	private String Address;
	private Long mobile;
}
