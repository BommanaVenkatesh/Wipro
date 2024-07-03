package com.venky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.venky.model.Product;
import com.venky.service.ProductService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> getAll() {
		List<Product> products= productService.getAllProducts();
		return ResponseEntity.ok(products);
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<Product> getById(@PathVariable("productId") int productId) {
		Product product= productService.getById(productId);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Product addProduct(@Valid @RequestBody Product product) {
		return productService.addProduct(product);
		
	}
	@PutMapping("/{productId}")
	public Product updateProduct(@PathVariable("productId") int productId,@Valid @RequestBody Product product) {
		return productService.updateProduct(productId, product);
	}
	
	@DeleteMapping("/{productId}")
	public ResponseEntity deleteProduct(@PathVariable("productId") int productId) {
		productService.deleteProduct(productId);
		return ResponseEntity.noContent().build();
	}
	
}
