package com.venky.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.venky.exception.ProductNotFoundException;

@ControllerAdvice
public class ErrorHandler {
	@ExceptionHandler(ProductNotFoundException.class)
	public String handleProductNotFound(ProductNotFoundException ex,RedirectAttributes attributes) {
		attributes.addFlashAttribute("message",ex.getMessage());
		return "redirect:/";
	}

}
