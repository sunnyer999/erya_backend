package com.veritas.automation.microservices.track.helpcenter.repository;

import com.veritas.automation.microservices.track.helpcenter.domain.IssueEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/7/2017
 * @version 1.0
 */
public interface ReportIssueRepository extends MongoRepository<IssueEntity, Long> {
}
