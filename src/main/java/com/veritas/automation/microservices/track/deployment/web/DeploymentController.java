package com.veritas.automation.microservices.track.deployment.web;

import com.veritas.automation.microservices.track.deployment.domain.CIResultsEntity;
import com.veritas.automation.microservices.track.deployment.service.DeploymentService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Project: erya
 *
 * @author Qihan.Luo 3/3/2017
 * @version 1.0
 */

@RestController
public class DeploymentController {
    private final DeploymentService deploymentService;
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public DeploymentController(DeploymentService deploymentService) {
        this.deploymentService = deploymentService;
    }

    @ApiOperation(value="GEt CI results", notes = "notes...")
    @GetMapping("/index")
    public List<CIResultsEntity> getCiResult() {
        List<CIResultsEntity> result = deploymentService.getCIList();
        result.forEach(e -> {
            System.out.println(e.getPipelineName());
        });
        return result;
    }

    @GetMapping("/deploy/api/0.1/foo1")
    public String getFoo() {
        return "hello world";
    }
}
