package com.venky.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venky.exceptions.ProductNotFoundException;
import com.venky.model.Product;
import com.venky.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	 
	private ProductRepository productRepository;
    
	//@Autowired one constriuctor no need
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository=productRepository;
		
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getById(int productId) {
		return productRepository.findById(productId).orElseThrow(()->new ProductNotFoundException("Product with id "+productId+" not found"));
	}

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(int productId,Product product) {
		Optional<Product> optProduct=productRepository.findById(productId);
		if(!optProduct.isPresent()) {
			throw new ProductNotFoundException("Product with id "+productId+" not found");
		}
	    Product prod=optProduct.get();
	    if(product.getProductName()!=null) {
	    	prod.setProductName(product.getProductName());
	    }
	    if(product.getProductPrice()!=0) {
	    	prod.setProductPrice(product.getProductPrice());
	    }
		return productRepository.save(prod);
	}

	@Override
	public void deleteProduct(int productId) {
		Optional<Product> optProduct=productRepository.findById(productId);
		if(!optProduct.isPresent()) {
			throw new ProductNotFoundException("Product with id "+productId+" not found");
		}
		productRepository.deleteById(productId);
	
	}

}
