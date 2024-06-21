package org.venky.dao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.venky.model.Product;
import org.venky.service.ProductService;
import org.venky.service.ProductServiceImpl;

public class ProductApp {
	private static Scanner scn=new Scanner(System.in);
	private static ProductService productService=new ProductServiceImpl();
	public static void main(String[] args) {
	int choice=0;
	while(true) {
		System.out.println("---Select the choice---");
		System.out.println("1.Get All Products");
		System.out.println("2.Get Product By Id");
		System.out.println("3.Add Product");
		System.out.println("4.Update Product");
		System.out.println("5.Delete Product");
		System.out.println("6.Exit");
		choice=scn.nextInt();
		switch(choice) {
		case 1:	var products=productService.getAll();
		for (Product product : products) {
			System.out.println(product);
		}
		System.out.println();
			break;
		case 2:System.out.println("Enter the Product Id");
		       int id=scn.nextInt();
			   Product product=productService.getById(id);
			   System.out.println(product);
			   System.out.println();
			break;
		case 3:addProduct();
			break;
		case 4:updateProduct();
			break;
		case 5:deleteProduct();
			break;
		case 6:System.out.println("Exit from Product...");
			System.exit(0);
			default:System.out.println("Invalid Choice");
		}
	}
	

	}
	private static void addProduct() {
		Product product=new Product();
		System.out.println("Enter Product Id");
		product.setProductId(scn.nextInt());
		scn.nextLine();
		System.out.println("Enter Product Name");
		product.setProductName(scn.nextLine());
		
		System.out.println("Enter Price");
		product.setPrice(scn.nextInt());
		System.out.println("Enter Quantity In Hand");
		product.setQuantityInHand(scn.nextInt());
		scn.nextLine();
		System.out.println("Enter Description");
		product.setDescription(scn.nextLine());
		System.out.println("Enter the Order date");
		String strDate=scn.nextLine();
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
		Date d;
		try {
			d = formatter.parse(strDate);
			product.setOrderDate(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String result=productService.addProduct(product);
		System.out.println(result);
		System.out.println();
		
		
	}
	private static void updateProduct() {
		Product product=new Product();
		System.out.println("Enter Product Id");
		product.setProductId(scn.nextInt());
		scn.nextLine();
		System.out.println("Enter Product Name");
		product.setProductName(scn.nextLine());
		
		System.out.println("Enter Price");
		product.setPrice(scn.nextInt());
		System.out.println("Enter Quantity In hand");
		product.setQuantityInHand(scn.nextInt());
		scn.nextLine();
		System.out.println("Enter Description");
		product.setDescription(scn.nextLine());
		System.out.println("Enter the Order date in dd-MM-yyyy format");
	   String strDate=scn.nextLine();
	   SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
	   Date d;
	try {
		d = formatter.parse(strDate);
		product.setOrderDate(d);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		String result=productService.updateProduct(product);
		System.out.println(result);
		System.out.println();
		
		
	}
	
	private static void deleteProduct() {
		System.out.println("Enter Product Id");
		int id=scn.nextInt();
		String result=productService.deleteProduct(id);
		System.out.println(result);
		System.out.println();
	}

}
