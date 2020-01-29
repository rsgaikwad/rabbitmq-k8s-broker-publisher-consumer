package com.example.rabbitmqpublisher.models.helloworld;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Data
@NoArgsConstructor
public class HelloworldModel {

    @Getter @Setter
    private String message = "Helloworld";
}