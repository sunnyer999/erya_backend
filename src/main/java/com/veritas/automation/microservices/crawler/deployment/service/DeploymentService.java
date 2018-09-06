package com.veritas.automation.microservices.crawler.deployment.service;

import com.veritas.automation.microservices.crawler.deployment.domain.DeploymentJobResultsEntity;

import java.util.List;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/27/2017
 * @version 1.0
 */
public interface DeploymentService {

    /**
     * find latest deploy status
     * @param deployJobName deployJobName<String>
     * @return List
     */
    List<DeploymentJobResultsEntity> getLatestDeployStatus(String deployJobName);


}
