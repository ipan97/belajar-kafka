package com.github.ipan97.belajarkafka.controller.api.v1;

import com.github.ipan97.belajarkafka.service.kafka.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ipan Taupik Rahman.
 * Date: 24/12/17
 * Time: 19:20
 * Project belajar-kafka
 * Package com.github.ipan97.belajarkafka.controller.api.v1
 */

@RestController
@RequestMapping("/api/v1/dummy/kafka")
public class DummyKafkaController {

    @Autowired
    private Producer producer;

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    @ResponseStatus(code = HttpStatus.OK, value = HttpStatus.OK)
    public void send(@RequestBody String message) {
        producer.send(message);
    }
}
