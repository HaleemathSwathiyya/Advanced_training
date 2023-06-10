package com.example.rabbitmqchatapplication.chatcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbitmqchatapplication.model.ChatMessage;
import com.example.rabbitmqchatapplication.producer.ChatProducer;

@RestController
public class ChatController {
	
	private final ChatProducer chatMessageProducer;

    @Autowired
    public ChatController(ChatProducer chatMessageProducer) {
        this.chatMessageProducer = chatMessageProducer;
    }

    @PostMapping("/chat")
    public void sendMessage(@RequestBody ChatMessage chatMessage) {
        chatMessageProducer.sendMessage(chatMessage);

    }

}
