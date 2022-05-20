package com.examples.ivmdiaz.exception;

import com.examples.ivmdiaz.dto.ResponseWrapperDto;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

/**
 * This class manage all the exceptions generated in the application.
 */
@ControllerAdvice
public class RestControllerExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseWrapperDto<ErrorDetails> handleGenericException(final Exception ex) {
        final ErrorDetails details = new ErrorDetails(INTERNAL_SERVER_ERROR.value(), ex.getMessage(), "global");
        return new ResponseWrapperDto<>(details, ex);
    }

    @ResponseBody
    @ExceptionHandler(TechnicalException.class)
    public ResponseWrapperDto<ErrorDetails> handleTechnicalException(final TechnicalException ex) {
        final ErrorDetails details = new ErrorDetails(BAD_REQUEST.value(), ex.getMessage(), "technical");
        if (Boolean.TRUE.equals(ex.hasErrors())) {
            details.setErrors(ex.getErrors());
        }
        return new ResponseWrapperDto<>(details, ex);
    }

    @ResponseBody
    @ExceptionHandler(BusinessException.class)
    public ResponseWrapperDto<ErrorDetails> handleBusinessException(final BusinessException ex) {
        final ErrorDetails details = new ErrorDetails(BAD_REQUEST.value(), ex.getMessage(), "business");
        if (Boolean.TRUE.equals(ex.hasErrors())) {
            details.setErrors(ex.getErrors());
        }
        return new ResponseWrapperDto<>(details, ex);
    }

}
