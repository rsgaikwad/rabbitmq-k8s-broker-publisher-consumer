package com.example.rabbitmqconsumer.mq.helloworld;

import com.example.rabbitmqconsumer.mq.MessageReceiver;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloworldMessageReceiver implements MessageReceiver {

	@Override
	@RabbitListener(queues = "${helloworld.queue}")
	public void receiveMessage(String message) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Received Message: " + message);
	}
	
}
