package com.test.survey.service;

import java.util.List;
import com.test.survey.entity.Survey;

public interface ISurveyService {

  List<Survey> getAllSurveys();

  Survey query(Long id);

  Survey save(Survey survey);

  void delete(Long id);

}
