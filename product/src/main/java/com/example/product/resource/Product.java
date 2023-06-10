package com.example.product.resource;

//import com.example.feignclient.model.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	private long productId;
	private String name;
	private String category;
	private String brand;
	private double price;
	
	

}
