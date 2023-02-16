package com.syswantob1.onlinestoreapps.controllers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.syswantob1.onlinestoreapps.models.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class customers {

  List<customer> customers = new ArrayList<>();

  @GetMapping
  public List<customer> listAll() {
    return customers;
  }

  @PostMapping
  public void addCustomer(String name, String email, String Password) {
    customer customer = new customer(name, email, Password);
    customers.add(customer);
  }
}
