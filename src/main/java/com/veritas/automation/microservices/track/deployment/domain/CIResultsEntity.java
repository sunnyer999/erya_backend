package com.veritas.automation.microservices.track.deployment.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/3/2017
 * @version 1.0
 */
@Document(collection = "ci_results")
public class CIResultsEntity {
    @Field
    private Integer triggerId;
    @Field
    private String pipelineName;

    public Integer getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(Integer triggerId) {
        this.triggerId = triggerId;
    }

    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

}
