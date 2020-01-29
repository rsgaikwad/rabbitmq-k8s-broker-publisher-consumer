package com.example.rabbitmqconsumer.mq;

public interface MessageReceiver {

	void receiveMessage(String message);
}