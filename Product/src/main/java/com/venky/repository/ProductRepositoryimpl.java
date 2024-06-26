package com.venky.repository;

import java.util.List;
import org.hibernate.Session;
import com.venky.model.Product;
import com.venky.util.DbUtil;

import jakarta.persistence.TypedQuery;

public class ProductRepositoryimpl implements ProductRepository {
	private Session session=DbUtil.getSession();

	@Override
	public List<Product> getAll() {
		TypedQuery<Product> query=session.createQuery("from Product", Product.class);
		System.out.println(query.getFirstResult()+"venky");
		return query.getResultList();
	}

	@Override
	public String addProduct(Product product) {
		System.out.println(product+"product");
		session.beginTransaction();
		session.persist(product);
		session.getTransaction().commit();
		return "Employee Saved Successfully";
	}

	@Override
	public void deleteProduct(int productId) {
		Product product=session.find(Product.class, productId);
		System.out.println(product.getProductId()+" product");
		session.beginTransaction();
		session.remove(product);
		session.getTransaction().commit();
	}

	@Override
	public Product getProductById(int productId) {
		Product product=session.find(Product.class, productId);
		return product;
	}
	
	 @Override
	    public void updateProduct(Product product) {  
	        session.beginTransaction();
	        session.merge(product);
	        session.getTransaction().commit();
	    }

}
