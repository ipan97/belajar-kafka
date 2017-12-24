package com.github.ipan97.belajarkafka.service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


/**
 * Created by Ipan Taupik Rahman.
 * Date: 24/12/17
 * Time: 19:10
 * Project belajar-kafka
 * Package com.github.ipan97.belajarkafka
 */
@Component
public class Producer {
    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private String topic = "test";


    public void send(String message) {
        LOGGER.info("Message [{}] to topic [{}]", message, topic);
        kafkaTemplate.send(topic, message);
    }
}
