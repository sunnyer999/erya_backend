package com.veritas.automation.microservices.crawler.deployment.domain;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/27/2017
 * @version 1.0
 */
public class Appliance {
    private String appliance;

    private String type;

    private String status;

    private String uri;

    public String getAppliance() {
        return appliance;
    }

    public void setAppliance(String appliance) {
        this.appliance = appliance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
