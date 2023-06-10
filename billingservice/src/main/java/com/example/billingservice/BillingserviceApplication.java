package com.example.billingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BillingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingserviceApplication.class, args);
	}

}
