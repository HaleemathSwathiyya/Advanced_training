package com.example.helloclient.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/client")
public class HelloClientResource {
	
	@Autowired
	RestTemplate template;
	@GetMapping
	public String callServer() {
		
//		String url = "http://localhost:8093/rest/service/status"; 
		//String url = "http://localhost:8093/rest/billing/status"; 
		
		
		//for direct execution
	String url = "http://localhost:8094/rest/service";
		String output = template.getForObject(url, String.class);
		return output;
		
	}

}

