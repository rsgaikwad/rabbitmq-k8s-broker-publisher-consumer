package com.example.rabbitmqpublisher.services.helloworld;

import com.example.rabbitmqpublisher.models.helloworld.HelloworldModel;
import com.example.rabbitmqpublisher.mq.helloworld.HelloworldMessageSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloworldServiceImpl implements HelloworldService {

    @Autowired
    private HelloworldMessageSender helloworldMessageSender;
    
    @Autowired
    private HelloworldModel helloworldModel;

    @Override
    public void sendMessage() {
        for (int i=1; i<=10;i++) {
            helloworldMessageSender.sendMessage(helloworldModel.getMessage());
        }
    }

}