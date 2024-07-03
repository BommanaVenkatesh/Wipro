package com.venky.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.venky.model.Product;
import com.venky.service.ProductService;

@ExtendWith(MockitoExtension.class)
class ProductControllerTest {
	@Mock
	ProductService productService;
	
	@InjectMocks
	ProductController productController;
	
	MockMvc mockMvc;
	
	ObjectMapper mapper=new ObjectMapper();
	
	@BeforeEach
	public void setUp() {
		mockMvc=MockMvcBuilders.standaloneSetup(productController).build();
	}
	

	@Test
	void testGetAll() throws Exception {
		List<Product> products=List.of(
				new Product(1, 5000, "Watch"),
				new Product(2, 10000, "Shoe"),
				new Product(3, 100000, "Pulsar Buke")
				);
		when(productService.getAllProducts()).thenReturn(products);
		mockMvc.perform(get("/api/products").accept(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$").exists())
		.andExpect(jsonPath("$.size()").value(3));
	
	}

	@Test
	void testGetById() throws Exception {
		int id=5;
		Product product=new Product(1, 25000, "Mobile");
		when(productService.getById(id)).thenReturn(product);
		mockMvc.perform(get("/api/products/{id}",id).accept(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$.productName").value("Mobile"));
	
	}

	@Test
	void testAddProduct() throws Exception {
		Product prod=new Product(5, 25000, "Mobile");
		String prodJson=mapper.writeValueAsString(prod);
		when(productService.addProduct(any(Product.class))).thenReturn(prod);
		mockMvc.perform(post("/api/products").content(prodJson).contentType(MediaType.APPLICATION_JSON_VALUE).accept(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(status().isCreated())
		.andExpect(jsonPath("$").exists())
		.andExpect(jsonPath("$.productName", is("Mobile")));
		
	}

	@Test
	void testUpdateProduct() throws Exception {
		int id=5;
		Product original=new Product(5, 25000, "Mobile");
		String prodJson=mapper.writeValueAsString(original);
		when(productService.updateProduct(anyInt(), any(Product.class))).thenReturn(original);
		mockMvc.perform(put("/api/products/{id}",id).content(prodJson).contentType(MediaType.APPLICATION_JSON_VALUE).accept(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(status().isOk());
		
		
	}

	@Test
	void testDeleteProduct() throws Exception {
		int id=5;
		mockMvc.perform(delete("/api/products/{id}",id))
		.andExpect(status().isNoContent());
		
	}

}
