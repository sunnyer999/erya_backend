package com.veritas.automation.microservices.crawler;

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
public class CrawlerServer {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "crawler-server");
        SpringApplication.run(CrawlerServer.class, args);
    }
}
