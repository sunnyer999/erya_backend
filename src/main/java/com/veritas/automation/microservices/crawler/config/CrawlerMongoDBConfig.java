package com.veritas.automation.microservices.crawler.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/27/2017
 * @version 1.0
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.veritas.automation.microservices.crawler")
public class CrawlerMongoDBConfig extends AbstractMongoConfiguration {

    /**
     * Config Mongodb database name
     */
    @Override
    protected String getDatabaseName() {
        return "crawler_service";
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
