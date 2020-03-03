package com.test.survey.exception.handler;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.test.survey.dto.ApiErrorResponseDto;
import com.test.survey.exception.SurveyException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class RestExceptionHandler {
  
  @ExceptionHandler(SurveyException.class)
  public ResponseEntity<Object> invalidParameterExceptionHandler(Exception exception) {
    return buildObjectResponseEntity(exception.getMessage(),
        HttpStatus.BAD_REQUEST.toString(), HttpStatus.BAD_REQUEST.toString(),
        HttpStatus.BAD_REQUEST.toString(), exception.getCause(), HttpStatus.BAD_REQUEST);
  }
  
  private ResponseEntity<Object> buildObjectResponseEntity(String message, String message2,
      String s, String name, Throwable cause, HttpStatus httpStatus) {
    ApiErrorResponseDto response =
        new ApiErrorResponseDto(message, new Date().toString(), message2, s, name);
    log.error("[cause:{}], [Message:{}]", cause, message);
    return new ResponseEntity<>(response, httpStatus);
  }
}
