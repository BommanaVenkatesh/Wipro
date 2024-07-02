package com.venky.service;

import java.util.List;

import com.venky.model.Product;

public interface ProductService {
	List<Product> getAll();
	Product getById(int productId);
	Product addProduct(Product product);
	Product updateProduct(Product product);
	void deleteProduct(int productId);

}
