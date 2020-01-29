package com.example.rabbitmqconsumer.models.root;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Data
@NoArgsConstructor
public class RootModel {

    @Getter @Setter
    private String message = "Welcome to RabbitMQ Consumer Service";
}