package com.example.demoapi.exception;

import com.example.demoapi.model.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestControllerAdvice
public class APIExceptionHandler {

    @ExceptionHandler({Exception.class})
    public ResponseEntity<?> exception(Exception e){

        ErrorResponse errorResponse = ErrorResponse.builder()
                .message(e.getMessage())
                .status(BAD_REQUEST.value())
                .build();

        return ResponseEntity
                .badRequest()
                .body(errorResponse);
    }

}
