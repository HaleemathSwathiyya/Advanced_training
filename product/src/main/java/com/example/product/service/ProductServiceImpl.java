package com.example.product.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.product.resource.Product;
import com.example.product.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	@HystrixCommand(fallbackMethod = "fallbackMethod")
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return   showProductList();
	}
	
	 public String fallbackMethod() {
	        // Fallback logic when the circuit is open
	        return "Fallback response";
	    }

	@Override
	public List<Product> findByCategory(String category) {
		System.out.println("<<<" +category +">>>");
		List<Product> list = showProductList()
				.stream()
				.filter((product) -> (product.getCategory().equals(category)))
				.collect(Collectors.toList());
		System.out.println(list);
		return list;
	}

	@Override
	public Product findById(int id) {
		
		return showProductList()
				.stream()
				.filter(product -> product.getProductId() == id)
				.findAny()
				.get();
		}
	
	private List<Product> showProductList(){
		
		return Arrays.asList(
				  
						     new Product(1,"iPhone 14","Mobile","Apple",74600),
							 new Product(2,"Split phone","Mobile","Samsung",84600),
							 new Product(3,"Grand Pixels","Mobile","Vivo",45600),
							   new Product(4,"iNSPIRON","Laptop","Dell",99900),
								 new Product(5,"Thinkpad","Laptop","Lenova",64600),
								 new Product(6,"K6 Note","Mobile","Lenova",35600),
								   new Product(7,"Bravo","TV","Sony",34600),
									 new Product(8,"HD Smart Tv","TV","Samsung",94600),
									 new Product(9,"Ideapad","Laptop","Vivo",45600)
							
				);
				
	}

}
