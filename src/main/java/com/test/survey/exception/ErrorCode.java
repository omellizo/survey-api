package com.test.survey.exception;

import org.springframework.http.HttpStatus;
import lombok.Getter;

@Getter
public enum ErrorCode {

  USER_NOT_FOUND("001", HttpStatus.BAD_REQUEST);
  
  private final String code;
  private final HttpStatus status;

  ErrorCode(final String code, final HttpStatus status) {
    this.code = code;
    this.status = status;
  }
}
