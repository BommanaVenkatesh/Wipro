package com.venky.service;

import java.util.List;

import com.venky.model.Product;
import com.venky.repository.ProductRepository;
import com.venky.repository.ProductRepositoryimpl;

public class ProductServiceImpl implements ProductService {
	private ProductRepository repository=new ProductRepositoryimpl();

	@Override
	public List<Product> getAll() {
		return repository.getAll();
	}

	@Override
	public String addProduct(Product product) {
		return repository.addProduct(product);
	}

	@Override
	public void deleteProduct(int productId) {
		repository.deleteProduct(productId);
		
	}

	@Override
	public Product getProductById(int productId) {
		return repository.getProductById(productId);
	}
	  @Override
	    public void updateProduct(Product product) { 
	        repository.updateProduct(product);
	    }

	

}
