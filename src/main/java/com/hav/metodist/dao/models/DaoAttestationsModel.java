package com.hav.metodist.dao.models;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "attestations")
public class DaoAttestationsModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "employee_id")
  private Long employeeId;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id")
  private DaoCategoriesModel category;
  @Column(name = "date")
  private Date date;
  @Column(name = "isComplete")
  private Byte isComplete;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getEmployee_id() {
    return employeeId;
  }

  public void setEmployee_id(Long employeeId) {
    this.employeeId = employeeId;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Byte getIsComplete() {
    return isComplete;
  }

  public void setIsComplete(Byte isComplete) {
    this.isComplete = isComplete;
  }

  public DaoCategoriesModel getCategory() {
    return category;
  }

  public void setCategory(DaoCategoriesModel category) {
    this.category = category;
  }
}
