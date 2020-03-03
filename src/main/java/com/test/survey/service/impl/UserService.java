package com.test.survey.service.impl;

import java.util.Objects;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.survey.entity.User;
import com.test.survey.exception.ErrorCode;
import com.test.survey.exception.SurveyException;
import com.test.survey.repository.UserRepository;
import com.test.survey.service.IUserService;

@Service
public class UserService implements IUserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public User findUser(User user) throws SurveyException {
    User userFound =
        userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());

    if (Objects.isNull(userFound)) {
      throw new SurveyException(ErrorCode.USER_NOT_FOUND, "Usuario No encontrado");
    }
    
    return userFound;

  }

}
