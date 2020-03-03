package com.test.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.survey.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

  User findByUsernameAndPassword(String username, String password);
}
