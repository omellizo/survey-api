package com.test.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.survey.entity.Survey;

public interface SurveyRepository extends JpaRepository<Survey, Long>{

}
