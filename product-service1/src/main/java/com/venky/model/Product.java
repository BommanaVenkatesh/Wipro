package com.venky.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Product {
	@Id
	private int productId;
	@Min(1000)
	private double productPrice;
	@Pattern(regexp = "[A-Za-z\s]+",message = "Product Name should contain only alphabets")
	private String productName;

}
