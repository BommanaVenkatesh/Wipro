package com.venky.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venky.exception.ProductNotFoundException;
import com.venky.model.Product;
import com.venky.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {
   @Autowired
   private ProductRepository repository;
	@Override
	public List<Product> getAll() {
		System.out.println(repository.findAll()+"venkatesh");
		return repository.findAll();
		
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return repository.findById(productId).orElseThrow(()->new ProductNotFoundException("Product with id "+productId+" does not exist"));
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}

	@Override
	public void deleteProduct(int productId) {
		repository.deleteById(productId);
		// TODO Auto-generated method stub

	}

}
