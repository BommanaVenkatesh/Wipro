package org.venky.dao;

import java.util.Collection;

import org.venky.model.Product;

public interface Productdao {
	Collection<Product> getAll();
	Product getById(int id);
	String addProduct(Product product);
	String updateProduct(Product product);
	String deleteProduct(int id);
}
