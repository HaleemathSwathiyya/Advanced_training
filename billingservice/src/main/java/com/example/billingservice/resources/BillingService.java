package com.example.billingservice.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/billing")
public class BillingService {
	
	
  @GetMapping
  public String Welcome() {
	  return "Programming Microservices bill generated" ;
  }
  
  @GetMapping("/status")
  public String status() {
	  return "Up and running bills generate";
  }

}
