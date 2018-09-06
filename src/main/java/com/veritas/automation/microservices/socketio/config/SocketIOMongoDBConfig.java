package com.veritas.automation.microservices.socketio.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/10/2017
 * @version 1.0
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.veritas.automation.microservices.track")
public class SocketIOMongoDBConfig extends AbstractMongoConfiguration {

    /**
     * Config Mongodb database name
     *
     */
    @Override
    protected String getDatabaseName() {
        return "crawler_service_cd";
    }

    /**
     * Config Mongodb Connection Info
     *
     * @throws Exception mongodbException
     */
    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(new ServerAddress("10.220.132.186", 8080));
    }

}
