package com.hav.metodist.dao.models;

import javax.persistence.*;

@Entity(name="category_types")
public class DaoCategoriesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeName;
    private String textTypeName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTextTypeName() {
        return textTypeName;
    }

    public void setTextTypeName(String textTypeName) {
        this.textTypeName = textTypeName;
    }
}
