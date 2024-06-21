package org.venky.service;

import java.util.Collection;

import org.venky.dao.Productdao;
import org.venky.dao.ProductdaoImpl;
import org.venky.model.Product;

public class ProductServiceImpl implements ProductService {
    private Productdao productdao=new ProductdaoImpl();
	@Override
	public Collection<Product> getAll() {
		// TODO Auto-generated method stub
		return productdao.getAll();
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return productdao.getById(id);
	}

	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return productdao.addProduct(product);
	}

	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productdao.updateProduct(product);
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		return productdao.deleteProduct(id);
	}

}
