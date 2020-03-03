package com.test.survey.service.impl;

import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.survey.entity.Survey;
import com.test.survey.repository.SurveyRepository;
import com.test.survey.service.ISurveyService;

@Service
public class SurveyService implements ISurveyService {

  @Autowired
  private SurveyRepository surveyRepository;
  
  @Override
  public List<Survey> getAllSurveys() {
    return surveyRepository.findAll();
  }

  @Override
  public Survey query(Long id) {
    return surveyRepository.findById(id).get();
  }

  @Override
  public Survey save(Survey survey) {
    survey.setResponseDate(Calendar.getInstance().getTime());
    return surveyRepository.save(survey);
  }

  @Override
  public void delete(Long id) {
    surveyRepository.deleteById(id);;
  }

}
