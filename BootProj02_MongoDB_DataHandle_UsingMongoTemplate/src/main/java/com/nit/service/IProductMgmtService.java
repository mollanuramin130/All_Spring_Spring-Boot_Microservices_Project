package com.nit.service;

import com.nit.model.Product;

public interface IProductMgmtService {
	public String productAdd(Product prod);
	public String productDeleteById(String id);
	public String productPriceUpdateByCatagory(String catagory,double hikePercentage);
}
