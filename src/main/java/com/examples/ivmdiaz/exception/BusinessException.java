package com.examples.ivmdiaz.exception;

import java.util.List;

/**
 * Contains the business errors throws to API clients
 */
public class BusinessException extends ApiExceptionBase {

    public BusinessException(final String message) {
        super(message);
    }

    public BusinessException(final String message, List<String> errors) {
        super(message, errors);
    }
}
