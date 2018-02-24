package com.hav.metodist.service.interfaces;

import com.hav.metodist.dao.models.DaoCategoriesModel;

import java.util.List;

public interface CategoriesServiceInterface {
    long save(DaoCategoriesModel category);
    DaoCategoriesModel get(long id);
    List<DaoCategoriesModel> list();
    DaoCategoriesModel update(DaoCategoriesModel category);
    long delete(long id);
}
