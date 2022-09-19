package com.jetskytec.kafka_test.controller;

import com.jetskytec.kafka_test.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("kafka")
@Controller
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @RequestMapping("sendMsg")
    @ResponseBody
    public void sendMsg(){
        kafkaProducer.send("Hello Java!");
    }

}
