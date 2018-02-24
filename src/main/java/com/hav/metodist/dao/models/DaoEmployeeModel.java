package com.hav.metodist.models.dao.dictionary;

import com.hav.metodist.models.response.dictionary.EmployeeModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="employees")
public class DaoEmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int tabNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date birthdate;
    private Byte sex;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
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

    public Byte getSex() {
      return sex;
    }

    public void setSex(Byte sex) {
      this.sex = sex;
    }

  public Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

    public int getTabNumber() {
        return tabNumber;
    }

    public void setTabNumber(int tabNumber) {
        this.tabNumber = tabNumber;
    }
}
