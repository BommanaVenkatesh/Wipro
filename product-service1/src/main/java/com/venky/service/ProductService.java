package com.venky.service;

import java.util.List;

import com.venky.model.Product;

public interface ProductService {
	List<Product> getAllProducts();
	Product getById(int productId);
	Product addProduct(Product product);
	Product updateProduct(int productId,Product product);
	void deleteProduct(int productId);
}
