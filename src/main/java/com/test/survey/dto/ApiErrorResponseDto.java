package com.test.survey.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @author Oscar Mellizo Angulo - omellizo@intergrupo.com
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ApiErrorResponseDto {

  String message;

  String timestamp;

  String errorCode;

  String statusCode;

  String detail;
}
