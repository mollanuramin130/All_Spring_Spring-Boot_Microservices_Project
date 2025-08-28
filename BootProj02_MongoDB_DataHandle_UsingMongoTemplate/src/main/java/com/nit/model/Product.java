package com.nit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "PRODUCTS")
@Data
public class Product {
	@Id
	private String id;
	private String pname;
	private Double price;
	private String brand;
	private String category;
	private Integer qty;
	
}
