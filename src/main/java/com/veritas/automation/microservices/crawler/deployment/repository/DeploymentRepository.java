package com.veritas.automation.microservices.crawler.deployment.repository;

import com.veritas.automation.microservices.crawler.deployment.domain.DeploymentJobResultsEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.stream.Stream;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/27/2017
 * @version 1.0
 */
public interface DeploymentRepository extends MongoRepository<DeploymentJobResultsEntity, Long> {

    List<DeploymentJobResultsEntity> findByName(String name, Pageable request);

}
