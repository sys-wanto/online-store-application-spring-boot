package com.syswantob1.onlinestoreapps.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.syswantob1.onlinestoreapps.models.customer;
import com.syswantob1.onlinestoreapps.models.entities.CustomerEntities;
import com.syswantob1.onlinestoreapps.services.customerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class customers {

  List<customer> customers = new ArrayList<>();

  @Autowired
  private customerService customerService;

  @GetMapping
  public Iterable<CustomerEntities> listAll() {
    return customerService.findAll();
  }

  @PostMapping
  public CustomerEntities addCustomer(@RequestBody CustomerEntities customers) {

    return customerService.save(customers);

  }
}
