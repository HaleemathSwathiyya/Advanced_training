package com.example.feignclient.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feignclient.interfaces.FeignInterface;
import com.example.feignclient.model.Product;
@RestController
@RequestMapping("/client")
public class FeignClient {

	 @Autowired
	 private FeignInterface feignclient;
	 
	 																																									//http://localhost:7082/client/allProducts
	 @GetMapping("/allProducts")
	 public List<Product> getAll() {
		 
		  return feignclient.getProducts();
	 }
	 																																												//http://localhost:7082/client/products-by-id/2
	 @GetMapping("/products-by-id/{id}")
		public Product getProductById(@PathVariable ("id") int id) {
		   System.out.println(id);
		   return feignclient.getProductsById(id);
	 }
	 																																											// http://localhost:7082/client/products-by-category/Mobile
	 @GetMapping("/products-by-category/{category}")
		public List<Product> getProductsByCategory(@PathVariable("category") String category){
		 
		           return feignclient.getProductsByCategory(category);
	 }
}
