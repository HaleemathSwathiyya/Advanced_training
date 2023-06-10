package com.example.realrabbitmqchatapplication.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
	
	private static final String QUEUE_NAME = "chat-queue";

    @Bean
    public Queue chatQueue() {
        return new Queue(QUEUE_NAME, false);
    }

}
