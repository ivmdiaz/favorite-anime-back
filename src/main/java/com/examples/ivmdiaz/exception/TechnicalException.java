package com.examples.ivmdiaz.exception;

/**
 * Contains the technical errors generated and controlled in the server
 */
public class TechnicalException extends ApiExceptionBase {

    public TechnicalException(String message) {
        super(message);
    }
}
