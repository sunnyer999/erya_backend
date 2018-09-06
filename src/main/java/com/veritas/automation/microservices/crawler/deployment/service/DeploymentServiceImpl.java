package com.veritas.automation.microservices.crawler.deployment.service;

import com.veritas.automation.microservices.crawler.deployment.domain.Appliance;
import com.veritas.automation.microservices.crawler.deployment.domain.DeploymentJobResultsEntity;
import com.veritas.automation.microservices.crawler.deployment.repository.DeploymentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * Project: erya
 *
 * @author Qihan.Luo 3/27/2017
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
    public List<DeploymentJobResultsEntity> getLatestDeployStatus(String deployName) {
        Pageable request = new PageRequest(0, 1, new Sort(Sort.Direction.DESC, "triggerId"));

        List<DeploymentJobResultsEntity> deployLatest = deploymentRepository.findByName(deployName, request);

        if (deployLatest.size() > 0) {
            List<Appliance> appliances = deployLatest.get(0).getDeployStatus();
            String uri = deployLatest.get(0).getUri();
            for (Appliance appliance : appliances) {
                appliance.setUri(uri);
            }
            final Function<Appliance, String> byStatus = Appliance::getStatus;
            List<Appliance> apps = appliances.stream()
                    .sorted(Comparator.comparing(byStatus))
                    .collect(Collectors.toList());
            deployLatest.get(0).setDeployStatus(apps);
        }
        return deployLatest;
    }
}
