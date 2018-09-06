package com.veritas.automation.microservices.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/6/2017
 * @version 1.0
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ScheduleServer {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "schedule-server");
        SpringApplication.run(ScheduleServer.class, args);
    }
}
