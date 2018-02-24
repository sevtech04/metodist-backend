package com.hav.metodist.models.response.dictionary;


import com.hav.metodist.dao.models.DaoCategoriesModel;

public class CategoriesModel  {

    private Long id;
    private String typeName;
    private String textTypeName;

    public CategoriesModel(){
        super();
    }
    public CategoriesModel(DaoCategoriesModel dao){
        this.id = dao.getId();
        this.typeName = dao.getTypeName();
        this.textTypeName = dao.getTextTypeName();
    }

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
