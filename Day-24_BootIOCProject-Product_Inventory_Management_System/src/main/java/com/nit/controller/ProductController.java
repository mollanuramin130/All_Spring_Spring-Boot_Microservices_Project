package com.nit.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.nit.dao.Product;
import com.nit.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    public String addProduct(Product product) {
        productService.addProduct(product);
        return "✅ Product added successfully.";
    }

    public Collection<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    public String getTotalInventoryValue() {
        double total = productService.totalInventoryValue();
        return "💰 Total Inventory Value: ₹" + total;
    }
}
