package com.venky.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.venky.model.Product;
import com.venky.repository.ProductRepository;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {
	
	@Mock
	ProductRepository productRepository;
	
	@InjectMocks
	ProductServiceImpl productService;

	

	@Test
	void testGetAllProducts() {
		List<Product> products=List.of(new Product(1,12000,"Samsung TV"),
				new Product(2,25000,"Bike"));
		when(productRepository.findAll()).thenReturn(products);
		List<Product> prods=productService.getAllProducts();
		assertAll(
				()->assertEquals(prods.size(), 2),
				()->assertEquals(prods.get(0).getProductName(), "Samsung TV")
				);
		
	}

	@Test
	void testGetById() {
		Product prod=new Product(1,500000,"Car");
		when(productRepository.findById(1)).thenReturn(Optional.of(prod));
		Product product=productService.getById(1);
		assertAll(
				()->assertEquals(product.getProductId(), 1),
				()->assertEquals(product.getProductName(), "Car"),
				()->assertEquals(prod, product)
				);
		
	}

	@Test
	void testAddProduct() {
		Product prod=new Product(5, 25000, "Fridge");
		when(productRepository.save(prod)).thenReturn(prod);
		Product product=productService.addProduct(prod);
		assertAll(
				()->assertEquals(prod, product),
				()->assertEquals(product.getProductPrice(), 25000),
				()->assertNotNull(product)
				);
		
	}

	@Test
	void testUpdateProduct() {
		Product prod=new Product(10, 50000, "Cooler");
		Product product=new Product(10, 0, "AC");
		when(productRepository.findById(10)).thenReturn(Optional.of(prod));
		when(productRepository.save(any(Product.class))).thenReturn(prod);
		Product updatedProduct=productService.updateProduct(10, product);
		assertAll(
				()->assertEquals(updatedProduct.getProductName(), "AC"),
				()->assertEquals(updatedProduct.getProductPrice(), 50000)
				);
		
	}

	@Test
	void testDeleteProduct() {
		Product prod=new Product(15, 50000, "Cooler");
		when(productRepository.findById(15)).thenReturn(Optional.of(prod));
		productService.deleteProduct(15);
		verify(productRepository,times(1)).deleteById(15);
		
		
	}

}
