package com.examples.ivmdiaz.exception;

import lombok.Getter;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains the base params and methods to manage the API exceptions in the application web.
 */
@Getter
public class ApiExceptionBase extends RuntimeException {

    private final List<String> errors = new ArrayList<>();

    public ApiExceptionBase(final String message) {
        super(message);
    }

    public ApiExceptionBase(final String message, final List<String> errors) {
        super(message);
        this.errors.addAll(errors);
    }
    
    protected Boolean hasErrors() {
        return !CollectionUtils.isEmpty(errors);
    }
}
