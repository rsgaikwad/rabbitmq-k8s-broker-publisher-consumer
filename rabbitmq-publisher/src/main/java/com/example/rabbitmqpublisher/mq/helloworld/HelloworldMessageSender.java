package com.example.rabbitmqpublisher.mq.helloworld;

import com.example.rabbitmqpublisher.mq.MessageSender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloworldMessageSender implements MessageSender {

	@Value("${helloworld.exchange}")
	private String hellloworldExchange;

	@Value("${helloworld.routing.key}")
	private String helloworldRoutingKey;

	@Autowired
	private AmqpTemplate amqpTemplate;

	public void sendMessage(String message) {
		this.amqpTemplate.convertAndSend(hellloworldExchange, helloworldRoutingKey, message);
	}
	
}
