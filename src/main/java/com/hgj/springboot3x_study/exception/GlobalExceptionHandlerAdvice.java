package com.hgj.springboot3x_study.exception;

import com.hgj.springboot3x_study.pojo.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandlerAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseMessage handleException(Exception e, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        log.error("Exception:{}", e);
        return new ResponseMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage(), null);
    }
}
