package com.test.survey.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.survey.constant.ResourceMapping;
import com.test.survey.entity.Survey;
import com.test.survey.service.ISurveyService;

@RestController
@RequestMapping(ResourceMapping.SURVEY_CONTROLLER_MAPPING)
public class SurveyController {

  @Autowired
  private ISurveyService surveyService;
  
  @GetMapping
  public List<Survey> getAllSurveys(){
      return surveyService.getAllSurveys();
  }
  
  @GetMapping("/{id}")
  public Survey getSurvey(@PathVariable Long id) {
      return surveyService.query(id);
  }
  
  @PostMapping
  public Survey createSurvey(@RequestBody Survey survey) {
      return surveyService.save(survey);
  }
  
  @PutMapping
  public Survey updateSurvey(@RequestBody Survey survey) {
      return surveyService.save(survey);
  }
  
  @DeleteMapping("/{id}")
  public void deleteSurvey(@PathVariable Long id) {
    surveyService.delete(id);
  }
}
