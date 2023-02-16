package com.syswantob1.onlinestoreapps.models;


public class customer {

  private String name;
  private String email;
  private String password;

  public customer(String name, String email, String password) {

    this.name = name;
    this.email = email;
    this.password = password;

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
}