package com.ps.ecommerce.exception;

import com.ps.ecommerce.base.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.http.HttpResponse;

//@RestControllerAdvice
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<BaseResponse> handleException(Exception e) {
        BaseResponse baseResponse = BaseResponse.builder()
                .status(false)
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message(e.getMessage())
                .data(null)
                .build();
        return new ResponseEntity<>(baseResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        BaseResponse baseResponse = BaseResponse.builder()
                .status(false)
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .message(exception.getMessage())
                .data(null)
                .build();
        return new ResponseEntity<>(baseResponse, HttpStatus.BAD_REQUEST);

    }

}
