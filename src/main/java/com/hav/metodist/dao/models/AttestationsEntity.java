package com.hav.metodist.dao.models;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "attestations", schema = "metodist")
public class AttestationsEntity {
    private int id;
    private EmployeesEntity employee;
    private CategoryTypesEntity category;
    private Date date;
    private boolean isComplete;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "employee_id",referencedColumnName = "id")
    public EmployeesEntity getEmployee() {
        return this.employee;
    }

    public void setEmployee(EmployeesEntity employee) {
        this.employee = employee;
    }

    @OneToOne
    @JoinColumn(name = "category_id", nullable = true)
    public CategoryTypesEntity getCategory() {
        return category;
    }
    public void setCategory(CategoryTypesEntity category) {
        this.category = category;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "isComplete", nullable = false)
    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttestationsEntity that = (AttestationsEntity) o;

        if (id != that.id) return false;
        if (employee != that.employee) return false;
        if (isComplete != that.isComplete) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + employee.hashCode();
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (isComplete ? 1 : 0);
        return result;
    }
}
