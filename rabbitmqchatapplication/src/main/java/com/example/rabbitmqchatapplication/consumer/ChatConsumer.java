package com.example.rabbitmqchatapplication.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.rabbitmqchatapplication.model.ChatMessage;

@Component
public class ChatConsumer {
	
	
	@RabbitListener(queues = "chat-queue")
    public void receiveMessage(ChatMessage chatMessage) {
        System.out.println("Received message from " + chatMessage.getSender() + " to " + chatMessage.getReceiver() + ": " + chatMessage.getContent());
        // Add logic to process the received message, e.g., store in a database, update UI, etc.
    }

}
