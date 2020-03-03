package com.test.survey.exception;

public class SurveyException extends Exception{

  private static final long serialVersionUID = 1L;

  private final ErrorCode errorCode;

  public SurveyException(ErrorCode errorCode, Throwable cause) {
    super("Error code: " + errorCode.getCode(), cause);
    this.errorCode = errorCode;
  }

  public SurveyException(ErrorCode errorCode, String message) {
    super(message + ": Error code: " + errorCode.getCode());
    this.errorCode = errorCode;
  }
}
