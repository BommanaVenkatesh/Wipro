package com.venky.repository;

import java.util.List;

import com.venky.model.Product;

public interface ProductRepository {
	List<Product> getAll();
	String addProduct(Product product);
	void deleteProduct(int productId);
	Product getProductById(int productId);
	 void updateProduct(Product product);
	


}
