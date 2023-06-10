package com.example.sleuthservice.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class SleuthService {
	
	private static final Logger logger= LoggerFactory.getLogger(SleuthService.class);
			
			@GetMapping("/data")
	public String sendResponse() {
		logger.info("In Service");
		return "from Service";
	}

}

//create microservices - patterns and 12 factor app features
//advanced microservices
//helloservice - web, devtools,discoveryclient
//registryservice
//clientservice
//gateway - service
//load balancing
//config server - local git and github
//feign clientservice
//histrick - circuit breaker
//sleuth and zipkin --> traceId and spanId
