package com.example.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.rabbitmq.config.MessagingConfig;
import com.example.rabbitmq.model.OrderStatus;

@Component
public class PurchaseOrderConsumer {
	
	@Value("${ust.rabbitmq.queue}")
	String queueName;
	
	@Value("${ust.rabbitmq.exchange}")
	String exchange;
	
	@Value("${ust.rabbitmq.routingkey}")
	String routingkey;

	//@RabbitListener(queue = MessagingConfig.queueName)
	@RabbitListener(queues = "ust_queue")
	public void consumerMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message received from queue :" + orderStatus);
	}

}
