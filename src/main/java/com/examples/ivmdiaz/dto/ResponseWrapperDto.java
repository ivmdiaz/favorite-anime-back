package com.examples.ivmdiaz.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ResponseWrapperDto<T> {
    private Boolean success;
    private LocalDateTime timestamp;
    private String message;
    private T data;

    public ResponseWrapperDto(final T data){
        this.success = Boolean.TRUE;
        this.timestamp = LocalDateTime.now();
        this.data = data;
    }

    public ResponseWrapperDto(final T data, final Exception exception){
        this.success = Boolean.FALSE;
        this.timestamp = LocalDateTime.now();
        this.message = exception.getMessage();
        this.data = data;
    }
}
