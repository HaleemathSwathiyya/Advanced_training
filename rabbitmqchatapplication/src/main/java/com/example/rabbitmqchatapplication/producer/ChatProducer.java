package com.example.rabbitmqchatapplication.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.rabbitmqchatapplication.model.ChatMessage;

@Component
public class ChatProducer {
	
	private RabbitTemplate rabbitTemplate = new RabbitTemplate();
    private static final String EXCHANGE_NAME = "chatExchange";

    @Autowired
    public ChatProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(ChatMessage chatMessage) {
        rabbitTemplate.convertAndSend(EXCHANGE_NAME, "", chatMessage);
    }
    
    
}
