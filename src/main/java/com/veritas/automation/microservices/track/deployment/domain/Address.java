package com.veritas.automation.microservices.track.deployment.domain;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/9/2017
 * @version 1.0
 */
public class Address {
    private String street;
    private String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
