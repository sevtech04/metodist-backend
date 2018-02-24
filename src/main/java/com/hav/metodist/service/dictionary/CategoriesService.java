package com.hav.metodist.service.dictionary;

import com.hav.metodist.dao.interfaces.CategoriesDao;
import com.hav.metodist.dao.models.DaoCategoriesModel;
import com.hav.metodist.service.interfaces.CategoriesServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class CategoriesService implements CategoriesServiceInterface {

    @Autowired
    CategoriesDao categoriesDao;

    @Override
    public long save(DaoCategoriesModel category) {
        return categoriesDao.save(category);
    }

    @Override
    public DaoCategoriesModel get(long id) {
        return categoriesDao.get(id);
    }

    @Override
    public List<DaoCategoriesModel> list() {
        return categoriesDao.list();
    }

    @Override
    public DaoCategoriesModel update(DaoCategoriesModel category) {
        return categoriesDao.update(category);
    }

    @Override
    public long delete(long id) {
        return categoriesDao.delete(id);
    }
}
