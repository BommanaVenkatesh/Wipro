package org.venky.dao;

import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.venky.exceptions.ProductNotFoundException;
import org.venky.model.Product;

public class ProductdaoImpl implements Productdao {
	private static Map<Integer,Product> prodDb=new HashMap<>();
	public ProductdaoImpl() {
		prodDb.put(1, new Product(1,"Book",100,5,"Java Book",new GregorianCalendar(2024,6,25).getTime()));
		prodDb.put(2, new Product(2,"Pen",30,25,"To Write",new GregorianCalendar(2024,7,25).getTime()));
		prodDb.put(3, new Product(3,"Pencil",10,33,"To Write and Erase",new GregorianCalendar(2024,8,25).getTime()));
		prodDb.put(4, new Product(4,"Bike",50000,1,"Splendor",new GregorianCalendar(2024,10,25).getTime()));
	}
	@Override
	public Collection<Product> getAll() {
		// TODO Auto-generated method stub
		return prodDb.values();
	}

	@Override
	public Product getById(int id) {
		Product product=prodDb.get(id);
		if(product==null) {
			throw new ProductNotFoundException();
		}
		return product;
	}

	@Override
	public String addProduct(Product product) {
		prodDb.put(product.getProductId(),product);
		return "Product with Id "+product.getProductId()+" Added Successfully";
	}

	@Override
	public String updateProduct(Product product) {
		Product prod=prodDb.get(product.getProductId());
		prod.setProductName(product.getProductName());
		prod.setPrice(product.getPrice());
		prod.setQuantityInHand(product.getQuantityInHand());
		prod.setDescription(product.getDescription());
		prod.setOrderDate(product.getOrderDate());
		return "Product with Id "+product.getProductId()+" updated successfully";
	}

	@Override
	public String deleteProduct(int id) {
		prodDb.remove(id);
		return "Product with Id "+id+" Removed Successfully";
	}

}
