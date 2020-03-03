package com.test.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.survey.entity.ComputerBrand;

public interface ComputerBrandRepository extends JpaRepository<ComputerBrand, Long>{

}
