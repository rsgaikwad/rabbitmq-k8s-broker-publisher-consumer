package com.example.rabbitmqpublisher.config.mq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;

@Configuration
@EnableRabbit
public class HelloworldConfig extends BaseMqConfig {

	@Value("${helloworld.exchange}")
	private String helloworldExchange;

	@Value("${helloworld.queue}")
	private String helloworldQueue;

	@Value("${helloworld.routing.key}")
	private String helloworldRoutingKey;

	@Bean
	DirectExchange helloworldExchange() {
		return new DirectExchange(helloworldExchange, true, false);
	}

	@Bean
	Queue helloworldQueue() {
		return new Queue(helloworldQueue, true, false, false);
	}

	@Bean
	Binding helloworldBinding() {
		return BindingBuilder.bind(helloworldQueue()).to(helloworldExchange()).with(helloworldRoutingKey);
	}

}