package com.venky.service;

import java.util.List;

import com.venky.model.Product;

public interface ProductService {
	List<Product> getAll();
	String addProduct(Product product);
	void deleteProduct(int productId);
	Product getProductById(int productId);
	  void updateProduct(Product product);

}
