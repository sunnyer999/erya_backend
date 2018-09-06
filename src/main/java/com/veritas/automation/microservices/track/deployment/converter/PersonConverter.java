package com.veritas.automation.microservices.track.deployment.converter;

import org.modelmapper.AbstractConverter;

/**
 * Project: erya
 *
 * @author Qihan.Luo 3/9/2017
 * @version 1.0
 */
public class PersonConverter extends AbstractConverter<String, String> {

    @Override
    protected String convert(String source) {
        return source.toUpperCase();
    }
}
