package com.ashwin.accessingdatamongo;

import org.springframework.data.annotation.Id;


public class Details {
  @Id
  private String id;

  private String name;

  private String email;
  
  private String firstName;

  private String surname;
  private int age;
  private int year;

  public Details(String name, String email, String firstName, String surname, int age, int year) {
	  this.age = age;
	  this.year = year;
	  this.email = email;
	  this.name = name;
	  this.firstName = firstName;
	  this.surname = surname;
  }
  public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
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
        "Details[id=%s, name='%s', email='%s', firstName='%s', surname='%s', age='%d', year='%d']",
        id, name, email, firstName, surname, age, year);
  }
}