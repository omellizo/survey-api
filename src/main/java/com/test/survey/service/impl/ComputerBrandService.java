package com.test.survey.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.survey.entity.ComputerBrand;
import com.test.survey.repository.ComputerBrandRepository;
import com.test.survey.service.IComputerBrandService;

@Service
public class ComputerBrandService implements IComputerBrandService {

  @Autowired
  private ComputerBrandRepository computerBrandRepository;
  
  @Override
  public List<ComputerBrand> getAllComputerBrands() {
    return computerBrandRepository.findAll();
  }
  
}
