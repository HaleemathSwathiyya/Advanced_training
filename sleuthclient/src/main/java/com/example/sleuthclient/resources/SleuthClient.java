package com.example.sleuthclient.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class SleuthClient {
	
	@Autowired
	RestTemplate template;
	
	private static final Logger logger = LoggerFactory.getLogger(SleuthClient.class);
	
	@GetMapping("/data")
	public String callService() {
		logger.info("In client resource:");
		
		String result = template.getForObject("http://localhost:9092/service/data", String.class);
				return result;
	}

}
