package com.veritas.automation.microservices.track;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrackServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "track-server");
        SpringApplication.run(TrackServer.class, args);
    }
}
