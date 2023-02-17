package com.syswantob1.onlinestoreapps.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syswantob1.onlinestoreapps.models.entities.CustomerEntities;
import com.syswantob1.onlinestoreapps.models.repo.customerRepo;

@Service
@Transactional
public class customerService {

  @Autowired
  private customerRepo customerRepo;

  public Iterable<CustomerEntities> findAll() {
    return customerRepo.findAll();
  }

  public CustomerEntities save(CustomerEntities customer) {
    return customerRepo.save(customer);
  }

  public List<CustomerEntities> findByEmail(String email) {
    return customerRepo.findByEmailContains(email);
  }
}
