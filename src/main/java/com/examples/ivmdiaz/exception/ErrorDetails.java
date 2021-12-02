package com.examples.ivmdiaz.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Contains the error model to return all the problems with the API
 */
@Data
@AllArgsConstructor
public class ErrorDetails {
    private LocalDateTime timestamp;
    private Integer status;
    private String message;
    private String category;
    private List<String> errors;

    public ErrorDetails(final Integer status, final String message, final String category) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.message = message;
        this.category = category;
    }
}
