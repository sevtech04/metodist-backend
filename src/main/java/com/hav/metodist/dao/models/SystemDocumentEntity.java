package com.hav.metodist.dao.models;

import javax.persistence.*;

@Entity
@Table(name = "system_document", schema = "metodist", catalog = "")
public class SystemDocumentEntity {
    private int id;
    private Integer fileId;
    private Boolean isNormative;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "file_id", nullable = true)
    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    @Basic
    @Column(name = "is_normative", nullable = true)
    public Boolean getNormative() {
        return isNormative;
    }

    public void setNormative(Boolean normative) {
        isNormative = normative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemDocumentEntity that = (SystemDocumentEntity) o;

        if (id != that.id) return false;
        if (fileId != null ? !fileId.equals(that.fileId) : that.fileId != null) return false;
        if (isNormative != null ? !isNormative.equals(that.isNormative) : that.isNormative != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fileId != null ? fileId.hashCode() : 0);
        result = 31 * result + (isNormative != null ? isNormative.hashCode() : 0);
        return result;
    }
}
