package com.veritas.automation.microservices.track.deployment.service;

import com.veritas.automation.microservices.track.deployment.domain.CIResultsEntity;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/3/2017
 * @version 1.0
 */
public interface DeploymentService {
    List<CIResultsEntity> getCIList();

}
