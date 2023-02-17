package com.syswantob1.onlinestoreapps.models.repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.syswantob1.onlinestoreapps.models.entities.CustomerEntities;

public interface customerRepo extends CrudRepository<CustomerEntities, UUID> {

  List<CustomerEntities> findByEmailContains(String name);
}
