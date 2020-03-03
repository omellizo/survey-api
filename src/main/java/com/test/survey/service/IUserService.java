package com.test.survey.service;

import com.test.survey.entity.User;
import com.test.survey.exception.SurveyException;

public interface IUserService {

  User findUser(User user) throws SurveyException;

}
