package com.hav.metodist.dao.models;

import javax.persistence.*;

@Entity
@Table(name = "category_types", schema = "metodist")
public class CategoryTypesEntity {
    private int id;
    private String typeName;
    private String textTypeName;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "typeName", nullable = false, length = 12)
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "textTypeName", nullable = true, length = 20)
    public String getTextTypeName() {
        return textTypeName;
    }

    public void setTextTypeName(String textTypeName) {
        this.textTypeName = textTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryTypesEntity that = (CategoryTypesEntity) o;

        if (id != that.id) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;
        if (textTypeName != null ? !textTypeName.equals(that.textTypeName) : that.textTypeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        result = 31 * result + (textTypeName != null ? textTypeName.hashCode() : 0);
        return result;
    }
}
