package com.veritas.automation.microservices.track.deployment.service;

import com.veritas.automation.microservices.track.deployment.domain.CIResultsEntity;
import com.veritas.automation.microservices.track.deployment.repository.DeploymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/3/2017
 * @version 1.0
 */
@Component("deploymentService")
public class DeploymentServiceImpl implements DeploymentService {
    private final DeploymentRepository deploymentRepository;

    @Autowired
    public DeploymentServiceImpl(DeploymentRepository deploymentRepository) {
        this.deploymentRepository = deploymentRepository;
    }

    @Override
    public List<CIResultsEntity> getCIList() {
        System.out.println("Call Service");
        Pageable pageableRequest = new PageRequest(0, 4);
        Page<CIResultsEntity> ciList = deploymentRepository.findAll(pageableRequest);
        System.out.println("Total Page is " + ciList.getTotalPages());
        return ciList.getContent();
    }
}
