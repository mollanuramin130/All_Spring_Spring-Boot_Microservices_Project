package com.nit.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.nit.dao.Product;

@Repository
public class ProductRepository {
	Map<Long,Product> productList=new HashMap<>();
	
	public void addProduct(Product product) {
		productList.put(product.getProductId(), product);
	}
	
	public Optional<Product> getProductById(Long productId) {
		return Optional.ofNullable(productList.get(productId));
	}
	
	public Collection<Product> getAllProducts(){
		return productList.values();
	}
	
}
