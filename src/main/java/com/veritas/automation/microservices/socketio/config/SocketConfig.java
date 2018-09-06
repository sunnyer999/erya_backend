package com.veritas.automation.microservices.socketio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/15/2017
 * @version 1.0
 */
@Configuration
public class SocketConfig {
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
