package com.example.rabbitmqpublisher.mq;

public interface MessageSender {

	void sendMessage(String message);
}