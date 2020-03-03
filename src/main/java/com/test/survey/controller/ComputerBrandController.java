package com.test.survey.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.survey.constant.ResourceMapping;
import com.test.survey.entity.ComputerBrand;
import com.test.survey.service.IComputerBrandService;

@RestController
@RequestMapping(ResourceMapping.COMPUTER_BRAND_CONTROLLER_MAPPING)
public class ComputerBrandController {

  @Autowired
  private IComputerBrandService computerBrandService;
  
  @GetMapping
  public List<ComputerBrand> getAllComputerBrands(){
      return computerBrandService.getAllComputerBrands();
  }
}
