package com.veritas.automation.microservices.crawler.deployment.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/27/2017
 * @version 1.0
 */
@Document(collection = "deployment_job_results")
public class DeploymentJobResultsEntity {
    @NotNull
    private Integer triggerId;

    @NotNull
    private String name;

    @NotNull
    private Integer buildId;

    @NotNull
    private String uri;

    @NotNull
    private String status;

    private List<Appliance> deployStatus;

    public Integer getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(Integer triggerId) {
        this.triggerId = triggerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBuildId() {
        return buildId;
    }

    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Appliance> getDeployStatus() {
        return deployStatus;
    }

    public void setDeployStatus(List<Appliance> deployStatus) {
        this.deployStatus = deployStatus;
    }
}
