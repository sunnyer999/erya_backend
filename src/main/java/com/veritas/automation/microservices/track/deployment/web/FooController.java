package com.veritas.automation.microservices.track.deployment.web;

import com.veritas.automation.microservices.track.deployment.converter.PersonConverter;
import com.veritas.automation.microservices.track.deployment.domain.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/9/2017
 * @version 1.0
 */
@RestController
public class FooController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/foo")
    public OrderDTO1 getOrder() {
        throw new NullPointerException();
//        System.out.println("GET REQUEST FOO");
//        Name myName = new Name();
//        myName.setFirstName("Little");
//        myName.setLastName("Roys");
//
//        Customer customer = new Customer();
//        customer.setName(myName);
//
//        Address myAddress = new Address();
//        myAddress.setCity("ChengDu");
//        myAddress.setStreet("Tianfu 4th street");
//
//        Order order = new Order();
//        order.setCustomer(customer);
//        order.setBillingAddress(myAddress);
//
//        ModelMapper modelMapper = new ModelMapper();
//
//        modelMapper.addMappings(new PropertyMap<Order, OrderDTO>() {
//            @Override
//            protected void configure() {
//                map().setBillingCity(source.getBillingAddress().getStreet());
//                //map(source.getBillingAddress().getCity().length(), destination.getCounter());
//            }
//        });
//
//        ModelMapper modelMap = new ModelMapper();
//
//        modelMap.addMappings(new PropertyMap<Order, OrderDTO1>() {
//            @Override
//            protected void configure() {
//                using(new PersonConverter()).map(source.getBillingAddress(), destination.getBillingCity());
//            }
//        });
//
//        return modelMap.map(order, OrderDTO1.class);
    }

    @ExceptionHandler(NullPointerException.class)
    public String controllerExceptionHandler(HttpServletRequest req, Exception e) {
        logger.error("---ControllerException Handler---Host {} invokes url {} ERROR: {}", req.getRemoteHost(), req.getRequestURL(), e.getMessage());
        return "---ControllerException Handler---:" + e.getMessage();
    }

}
