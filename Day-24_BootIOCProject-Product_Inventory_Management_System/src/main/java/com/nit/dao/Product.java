package com.nit.dao;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //@Data is composed of @ToString, @EqualsAndHashCode, @Getter, @Setter, and @RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Product {
	private long productId;
	private String productName;
	private int productQuantity;
	private Double productPrice;
	
}
