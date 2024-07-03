package com.venky.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venky.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findByProductName(String productName);
	List<Product> findByProductPriceGreaterThan(double productPrice);

}
