package com.test.survey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.survey.constant.ResourceMapping;
import com.test.survey.entity.User;
import com.test.survey.exception.SurveyException;
import com.test.survey.service.IUserService;

@RestController
@RequestMapping(ResourceMapping.USER_CONTROLLER_MAPPING)
public class UserController {
  
  @Autowired
  private IUserService userService;
  
  @PostMapping
  public User findUser(@RequestBody User user) throws SurveyException {
      return userService.findUser(user);
  }
}
