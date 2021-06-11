package com.ashwin.accessingdatamongo;

import org.springframework.data.annotation.Id;

public class User {
  @Id
  private String id;

  private String name;

  private String email;
  
  public User(String name, String email) {
	  this.email = email;
	  this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  @Override
  public String toString() {
    return String.format(
        "User[id=%s, name='%s', email='%s']",
        id, name, email);
  }
}