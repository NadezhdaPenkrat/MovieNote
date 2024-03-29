package com.movienote.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ErrorDetails {

    private final String message;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timestamp;

    public ErrorDetails(String message,
                        HttpStatus httpStatus,
                        ZonedDateTime timestamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }
}

