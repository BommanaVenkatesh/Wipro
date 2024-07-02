package com.venky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.venky.model.Product;
import com.venky.service.ProductService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	@GetMapping("/")
	public String index(Model model) {
		List<Product> products = service.getAll();
		model.addAttribute("products",products);
		return "index";
	}
	
	@GetMapping("/add")
	public String showAdd(Model model) {
		Product product=new Product();
		model.addAttribute("product",product);
		return "add";
	}
	
	@PostMapping("/add-product")
	public String addProduct(@Valid Product product,BindingResult result) {
		if(result.hasErrors()) {
			return "add";
		}
		service.addProduct(product);
		return "redirect:/";
	}
	
	@GetMapping("/update")
	public String showUpdate(@RequestParam int productId,Model model) {
		Product product=service.getById(productId);
		model.addAttribute(product);
		return "update";
	}
	
	@PostMapping("/update-product")
	public String updateProduct(@Valid Product product,BindingResult result) {
		if(result.hasErrors()) {
			return "update";
		}
		service.updateProduct(product);
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam int productId) {
		service.deleteProduct(productId);
		return "redirect:/";
		
	}
	
	@GetMapping("/search")
	public String search(HttpServletRequest request,Model model) {
		int id=Integer.parseInt(request.getParameter("searchItem"));
		Product product=service.getById(id);
		model.addAttribute(product);
		return "details";
	}

}
