package com.hav.metodist.dao.models;

import javax.persistence.*;

@Entity
@Table(name = "employees_contacts", schema = "metodist")
public class EmployeesContactsEntity {
    private int id;
    private EmployeesEntity employee;
    private int contactTypeId;
    private String contact;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    public EmployeesEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeesEntity employee) {
        this.employee = employee;
    }

    @Basic
    @Column(name = "contact_type_id", nullable = false)
    public int getContactTypeId() {
        return contactTypeId;
    }

    public void setContactTypeId(int contactTypeId) {
        this.contactTypeId = contactTypeId;
    }

    @Basic
    @Column(name = "contact", nullable = true, length = 20)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeesContactsEntity that = (EmployeesContactsEntity) o;

        if (id != that.id) return false;
        if (employee != that.employee) return false;
        if (contactTypeId != that.contactTypeId) return false;
        if (contact != null ? !contact.equals(that.contact) : that.contact != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + employee.hashCode();
        result = 31 * result + contactTypeId;
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        return result;
    }
}
