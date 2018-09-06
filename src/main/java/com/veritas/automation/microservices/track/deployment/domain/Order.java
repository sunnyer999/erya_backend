package com.veritas.automation.microservices.track.deployment.domain;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/8/2017
 * @version 1.0
 */
public class Order {
    private Customer customer;
    private Address billingAddress;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}
