package com.example.rabbitmq.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbitmq.config.MessagingConfig;
import com.example.rabbitmq.model.OrderStatus;
import com.example.rabbitmq.model.PurchaseOrder;

@RestController
@RequestMapping("/order")
public class PurchaseOrderPublisher {
	
	@Value("${ust.rabbitmq.queue}")
	String queueName;
	
	@Value("${ust.rabbitmq.exchange}")
	String exchange;
	
	@Value("${ust.rabbitmq.routingkey}")
	String routingkey;
	
	//publisher has a dependency on template
	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/{customerName}")
	public String bookOrder(@RequestBody PurchaseOrder order, @PathVariable String customerName) {
		
		order.setOrderId(UUID.randomUUID().toString());
		//other service calls
		//other service calls
		OrderStatus orderStatus = new OrderStatus(order, "ACCEPTED", "Order placed successfully by" + customerName);
//		template.convertAndSend(MessagingConfig.exchange, MessagingConfig.exchange, orderStatus);
		template.convertAndSend(exchange,routingkey, orderStatus);
		return "SUCCESS"; // this is confirmation to the sender of order
		
	}

}
