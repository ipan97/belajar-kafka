package com.github.ipan97.belajarkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BelajarKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BelajarKafkaApplication.class, args);
    }
}
