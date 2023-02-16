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

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tbl_customers")
public class Customers implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "customer_id", insertable = false, updatable = false, nullable = false)
  private UUID customer_id;
  
  @Column(name = "name", insertable = true, updatable = true, nullable = false)
  private String name;

  @Column(name = "email", insertable = true, updatable = true, nullable = false)
  private String email;

  @Column(name = "password", insertable = true, updatable = true, nullable = false)
  private String password;

  @UpdateTimestamp
  @Column(name = "registration_date", insertable = false, updatable = false, nullable = false)
  private Timestamp registration_date;

  public Customers() {
  }

  public Customers(UUID customer_id, String name, String email, String password, Timestamp registration_date) {
    this.customer_id = customer_id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.registration_date = registration_date;
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

  public void setRegistration_date(Timestamp registration_date) {
    this.registration_date = registration_date;
  }

}
