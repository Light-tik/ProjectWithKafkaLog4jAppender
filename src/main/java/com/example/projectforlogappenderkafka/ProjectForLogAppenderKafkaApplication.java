package com.example.projectforlogappenderkafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ProjectForLogAppenderKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectForLogAppenderKafkaApplication.class, args);
        log.info("Application Started");
        log.info("Appender worked");
        log.info("Everything send to Kafka");
    }
}
