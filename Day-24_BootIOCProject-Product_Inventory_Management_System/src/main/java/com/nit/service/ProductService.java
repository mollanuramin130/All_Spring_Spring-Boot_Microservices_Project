package com.nit.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.Product;
import com.nit.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}
	
	public Collection<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}
	
	public Optional<Product> getProductById(Long productId){
		return productRepository.getProductById(productId);
	}
	
	public double totalInventoryValue() {
		double totalSum = productRepository.getAllProducts().stream().mapToDouble(productObj->{
			return productObj.getProductPrice() * productObj.getProductQuantity();
		}).sum();
		return totalSum;
	}
	
}
