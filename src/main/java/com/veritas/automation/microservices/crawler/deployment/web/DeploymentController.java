package com.veritas.automation.microservices.crawler.deployment.web;


import com.veritas.automation.microservices.crawler.deployment.domain.DeploymentJobResultsEntity;
import com.veritas.automation.microservices.crawler.deployment.service.DeploymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/27/2017
 * @version 1.0
 */
@RestController
public class DeploymentController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final DeploymentService deploymentService;

    @Autowired
    public DeploymentController(DeploymentService deploymentService) {
        this.deploymentService = deploymentService;
    }

    @GetMapping("/api/0.1/deployment/deploy-status/{deployJobName}")
    public List<DeploymentJobResultsEntity> getAppliances(@PathVariable String deployJobName) {
        List<DeploymentJobResultsEntity> appliancesList = null;

        try {
            appliancesList = deploymentService.getLatestDeployStatus(deployJobName);
        } catch (Exception e) {
            logger.error("Get Appliance Error", e);
        }

        return appliancesList;
    }


}
