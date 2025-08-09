package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.w3c.dom.ls.LSOutput;

import com.nit.controller.ProductController;
import com.nit.dao.Product;

@SpringBootApplication
public class Day24BootIocProjectProductInventoryManagementSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Day24BootIocProjectProductInventoryManagementSystemApplication.class, args);
		ProductController productController = context.getBean(ProductController.class);
		Product product1=new Product(101, "Mobile", 2, 12999D);
		
		String product = productController.addProduct(product1);
		System.out.println(product);
		
//		Product product2=new Product(101, "Mobile", 2, 12999D);
		System.out.println(productController.addProduct(new Product(102, "Laptop", 3, 45500D)));
		
		System.out.println(productController.getTotalInventoryValue());
		productController.getAllProducts().stream().forEach(System.out::println);
	}

}
