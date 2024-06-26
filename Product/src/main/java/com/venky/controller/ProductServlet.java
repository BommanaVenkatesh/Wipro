package com.venky.controller;

import java.io.IOException;
import java.util.List;
import com.venky.model.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import com.venky.service.ProductService;
import com.venky.service.ProductServiceImpl;



public class ProductServlet extends HttpServlet {
	private ProductService service=new ProductServiceImpl();
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();
		HttpSession session=request.getSession();
		if(path.equals("/products")) {
			List<Product> products=service.getAll();
			session.setAttribute("products", products);
			response.sendRedirect("index1.jsp");	
		}
		if(path.equals("/add")) {
			response.sendRedirect("add.jsp");
		}
		if(path.equals("/add-product")) {
			int productId=Integer.parseInt(request.getParameter("productId"));
			double productPrice=Double.parseDouble(request.getParameter("productPrice"));
			String productName=request.getParameter("productName");
			Product product=new Product(productId, productPrice, productName);
			service.addProduct(product);
			response.sendRedirect("products");
		}
		if(path.equals("/delete")) {
			int productId=Integer.parseInt(request.getParameter("productId"));
			service.deleteProduct(productId);
			response.sendRedirect("products");
		}
		if (path.equals("/edit")) {  // New path for editing a product
            int productId = Integer.parseInt(request.getParameter("productId"));
            Product product = service.getProductById(productId);
            session.setAttribute("product", product);
            response.sendRedirect("update.jsp");
        }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String path = request.getServletPath();

	        if (path.equals("/update-product")) {  // Handle update product form submission
	            int productId = Integer.parseInt(request.getParameter("productId"));
	            double productPrice = Double.parseDouble(request.getParameter("productPrice"));
	            String productName = request.getParameter("productName");
	            Product product = new Product(productId, productPrice, productName);
	            service.updateProduct(product);  // Call update method in service
	            response.sendRedirect("products");
	        } else {
	            doGet(request, response);
	        }
	}

}
