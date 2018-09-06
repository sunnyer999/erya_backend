package com.veritas.automation.microservices.track.deployment.repository;

import com.veritas.automation.microservices.track.deployment.domain.CIResultsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/3/2017
 * @version 1.0
 */
public interface DeploymentRepository extends MongoRepository<CIResultsEntity, Long> {

}
