package com.shamolima.core.customer.customerservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.jmx.access.InvalidInvocationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody HttpErrorInfo handleInvalidInputException(ServerHttpRequest request,
                                                                   InvalidInvocationException ex) {
        return new HttpErrorInfo(HttpStatus.BAD_REQUEST.value(), "Invalid format");
    }
}
