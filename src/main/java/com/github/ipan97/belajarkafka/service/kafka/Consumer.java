package com.github.ipan97.belajarkafka.service.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by Ipan Taupik Rahman.
 * Date: 24/12/17
 * Time: 19:16
 * Project belajar-kafka
 * Package com.github.ipan97.belajarkafka
 */
@Component
public class Consumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "test")
    public void recive(String message) {
        LOGGER.info("Recived Message [{}]", message);
    }
}
