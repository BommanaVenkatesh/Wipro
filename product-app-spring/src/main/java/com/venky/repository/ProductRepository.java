package com.venky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venky.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
