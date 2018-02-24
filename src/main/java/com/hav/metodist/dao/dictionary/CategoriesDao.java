package com.hav.metodist.dao.dictionary;

import com.hav.metodist.dao.models.DaoCategoriesModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class CategoriesDao implements com.hav.metodist.dao.interfaces.CategoriesDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public long save(DaoCategoriesModel category) {
        sessionFactory.getCurrentSession().save(category);
        return category.getId();
    }

    @Override
    public DaoCategoriesModel get(long id) {
        return sessionFactory.getCurrentSession().get(DaoCategoriesModel.class,id);
    }

    @Override
    public List<DaoCategoriesModel> list() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<DaoCategoriesModel> criteriaQuery = criteriaBuilder.createQuery(DaoCategoriesModel.class);
        Root<DaoCategoriesModel> root = criteriaQuery.from(DaoCategoriesModel.class);
        criteriaQuery.select(root);
        Query<DaoCategoriesModel> query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }

    @Override
    public DaoCategoriesModel update(DaoCategoriesModel category) {
        Session session = sessionFactory.getCurrentSession();
        DaoCategoriesModel origin = session.byId(DaoCategoriesModel.class).load(category.getId());
        origin.setTypeName(category.getTypeName());
        origin.setTextTypeName(category.getTextTypeName());
        session.flush();
        return category;
    }

    @Override
    public long delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        DaoCategoriesModel origin = session.byId(DaoCategoriesModel.class).load(id);
        session.delete(origin);
        return id;
    }
}
