package com.example.rabbit.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@RequestMapping(value = "/rabbitmq/")
@Controller
public class ControllerRab {
    @Autowired
    ServiceRab rabbitMQSender;

    @PostMapping(value = "/producer")
    public String producer(@RequestParam(value="message") String message) throws IOException {
        rabbitMQSender.send(message);
        return "Message sent to the RabbitMQ Successfully";
    }
}
