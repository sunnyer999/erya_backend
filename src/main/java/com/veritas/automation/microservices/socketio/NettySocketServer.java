package com.veritas.automation.microservices.socketio;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Project: erya
 *
 * @author Qihan.Luo 3/10/2017
 * @version 1.0
 */
@SpringBootApplication
public class NettySocketServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "netty-socket-server");
        SpringApplication.run(NettySocketServer.class, args);
    }
}
