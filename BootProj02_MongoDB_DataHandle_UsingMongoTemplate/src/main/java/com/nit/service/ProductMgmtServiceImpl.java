package com.nit.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import com.nit.model.Product;

@Service("productService")
public class ProductMgmtServiceImpl implements IProductMgmtService {
	@Autowired
	private MongoTemplate templete;

	@Override
	public String productAdd(Product prod) {
		Product insert = templete.insert(prod, "PRODUCTS");
		return insert.getId();
	}

	@Override
	public String productDeleteById(String id) {
		Query query=new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		DeleteResult remove = templete.remove(query, "PRODUCTS");
		

	    if (remove.getDeletedCount() > 0) {
	        return remove.getDeletedCount() + " Product(s) deleted successfully.";
	    } else {
	        return "No product found with id: " + id;
	    }
		
	}

	@Override
	public String productPriceUpdateByCatagory(String catagory, double hikePercentage) {
		Query query=new Query();
		query.addCriteria(Criteria.where("category").is(catagory));
		Update update=new Update();
//		update.set("price", 60000);
		update.multiply("price", (1+hikePercentage/100.0));

		
		UpdateResult updateFirst = templete.updateMulti(query, update, "PRODUCTS");
		
		return updateFirst.getModifiedCount()+" Rows Updated successfully!!!";
	}
	

}
