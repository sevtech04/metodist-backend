package com.hav.metodist.models.response.dictionary;

import com.hav.metodist.dao.models.EmployeesEntity;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeModel {

  private int id;
  private int tabNumber;
  private String firstName;
  private String lastName;
  private String middleName;
  private Date birthdate;
  private Boolean sex;

  private String fullName;
  private String sexRepresentation;

  public EmployeeModel(){
    super();
  }
  public EmployeeModel(EmployeesEntity daoModel){
    //DateFormat fmt = new SimpleDateFormat("dd.MM.yyyy HH:mm:ssZ");
    this.id = daoModel.getId();
    this.tabNumber = daoModel.getTabNumber();
    this.firstName = daoModel.getFirstName();
    this.lastName = daoModel.getLastName();
    this.middleName = daoModel.getMiddleName();
    this.birthdate = daoModel.getBirthdate();
    this.sex = daoModel.getSex();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Boolean getSex() {
    return sex;
  }

  public void setSex(Boolean sex) {
    this.sex = sex;
  }

  public String getFullName() {
    return lastName + ' ' + firstName + ' ' + middleName;
  }

  public String getSexRepresentation() {
    return sex  ? "М" : "Ж";
  }


  public int getTabNumber() {
    return tabNumber;
  }

  public void setTabNumber(int tabNumber) {
    this.tabNumber = tabNumber;
  }

  public Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }
}
