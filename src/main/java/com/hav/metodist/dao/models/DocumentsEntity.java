package com.hav.metodist.dao.models;

import javax.persistence.*;

@Entity
@Table(name = "documents", schema = "metodist", catalog = "")
public class DocumentsEntity {
    private int id;
    private int fileId;
    private int employeeId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "file_id", nullable = false)
    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    @Basic
    @Column(name = "employee_id", nullable = false)
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DocumentsEntity that = (DocumentsEntity) o;

        if (id != that.id) return false;
        if (fileId != that.fileId) return false;
        if (employeeId != that.employeeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + fileId;
        result = 31 * result + employeeId;
        return result;
    }
}
