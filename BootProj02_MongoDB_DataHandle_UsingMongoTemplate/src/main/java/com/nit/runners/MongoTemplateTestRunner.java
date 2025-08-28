package com.nit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.service.IProductMgmtService;

@Component
public class MongoTemplateTestRunner implements CommandLineRunner{
	@Autowired
	private IProductMgmtService prodService;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 //Product Insertion
		Product prod=new Product();
		prod.setPname("Laptop");
		prod.setPrice(65000.0);
		prod.setBrand("Apple");
		prod.setQty(2);
		prod.setCategory("Electronic");
		String productId = prodService.productAdd(prod);
		System.out.println("Product Added Successfully with ID: "+productId);
		*/
		
		/*
		//Product Delete
		System.out.println(prodService.productDeleteById("68a8c861fa2e821c86d4ea82"));
		*/
		
		//Product Update
		System.out.println(prodService.productPriceUpdateByCatagory("Electronic",20));
	}

}
