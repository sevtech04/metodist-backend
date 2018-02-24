package com.hav.metodist.dao.models;

import javax.persistence.*;

@Entity(name = "employees_passport")
public class EmployeesPassportEntity {
    private int id;
    private Integer passportNumber;
    private String passportSeria;
    private String passportEmitent;
    private String comments;



    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "passport_number", nullable = true)
    public Integer getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(Integer passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Basic
    @Column(name = "passport_seria", nullable = true, length = 4)
    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    @Basic
    @Column(name = "passport_emitent", nullable = true, length = 256)
    public String getPassportEmitent() {
        return passportEmitent;
    }

    public void setPassportEmitent(String passportEmitent) {
        this.passportEmitent = passportEmitent;
    }

    @Basic
    @Column(name = "comments", nullable = true, length = 256)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeesPassportEntity that = (EmployeesPassportEntity) o;

        if (id != that.id) return false;
        if (passportNumber != null ? !passportNumber.equals(that.passportNumber) : that.passportNumber != null)
            return false;
        if (passportSeria != null ? !passportSeria.equals(that.passportSeria) : that.passportSeria != null)
            return false;
        if (passportEmitent != null ? !passportEmitent.equals(that.passportEmitent) : that.passportEmitent != null)
            return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (passportNumber != null ? passportNumber.hashCode() : 0);
        result = 31 * result + (passportSeria != null ? passportSeria.hashCode() : 0);
        result = 31 * result + (passportEmitent != null ? passportEmitent.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        return result;
    }


}
