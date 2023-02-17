package com.syswantob1.onlinestoreapps.models.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tbl_customers")
public class CustomerEntities implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "customer_id", insertable = false, updatable = false, nullable = false)
  private UUID customer_id;

  @NotEmpty(message = "Nama tidak boleh kosong")
  @Column(name = "name", insertable = true, updatable = true, nullable = false, length = 100)
  private String name;

  @NotEmpty(message = "email tidak boleh kosong")
  @Email(message = "Harus format email")
  @Column(name = "email", insertable = true, updatable = true, nullable = false, length = 100, unique = true)
  private String email;

  @NotEmpty(message = "password tidak boleh kosong")
  @Column(name = "password", insertable = true, updatable = true, nullable = false, length = 100)
  private String password;

  @CreationTimestamp
  @Column(name = "registration_date", insertable = false, updatable = false, nullable = false)
  private Timestamp registration_date;

  public CustomerEntities() {
  }

  public CustomerEntities(UUID customer_id, String name, String email, String password) {
    this.customer_id = customer_id;
    this.name = name;
    this.email = email;
    this.password = password;
  }

  public UUID getCustomer_id() {
    return customer_id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public Timestamp getRegistration_date() {
    return registration_date;
  }

  public void setCustomer_id(UUID customer_id) {
    this.customer_id = customer_id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
