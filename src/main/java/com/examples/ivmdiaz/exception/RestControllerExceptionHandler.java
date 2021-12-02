package com.examples.ivmdiaz.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

/**
 * This class manage all the exceptions generated in the application.
 */
@ControllerAdvice
public class RestControllerExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleGenericException(final Exception ex) {
        return new ResponseEntity<>(
                new ErrorDetails(INTERNAL_SERVER_ERROR.value(), ex.getMessage(), "global"), INTERNAL_SERVER_ERROR
        );
    }

    @ResponseBody
    @ExceptionHandler(TechnicalException.class)
    public ResponseEntity<ErrorDetails> handleTechnicalException(final TechnicalException ex) {
        final HttpStatus status = BAD_REQUEST;
        final ErrorDetails entity = new ErrorDetails(status.value(), ex.getMessage(), "technical");
        if (Boolean.TRUE.equals(ex.hasErrors())) {
            entity.setErrors(ex.getErrors());
        }
        return new ResponseEntity<>(entity, status);
    }

    @ResponseBody
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorDetails> handleBusinessException(final BusinessException ex) {
        final HttpStatus status = BAD_REQUEST;
        final ErrorDetails entity = new ErrorDetails(status.value(), ex.getMessage(), "business");
        if (Boolean.TRUE.equals(ex.hasErrors())) {
            entity.setErrors(ex.getErrors());
        }
        return new ResponseEntity<>(entity, status);
    }

}
