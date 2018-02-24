package com.hav.metodist.dao.dictionary;

import com.hav.metodist.dao.models.EmployeesEntity;
import com.hav.metodist.models.dao.dictionary.DaoEmployeeModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.hibernate.query.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


@Repository
public class EmployeeDao implements com.hav.metodist.dao.interfaces.EmployeeDao {

  @Autowired
  private SessionFactory sessionFactory;


  public long save(EmployeesEntity employee) {
    sessionFactory.getCurrentSession().save(employee);
    return employee.getId();
  }

  public EmployeesEntity get(long id) {
    return sessionFactory.getCurrentSession().get(EmployeesEntity.class,id);
  }

  public List<EmployeesEntity> list() {
    Session session = sessionFactory.getCurrentSession();
    CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
    CriteriaQuery<EmployeesEntity> criteriaQuery = criteriaBuilder.createQuery(EmployeesEntity.class);
    Root<EmployeesEntity> root = criteriaQuery.from(EmployeesEntity.class);
    criteriaQuery.select(root);
    Query<EmployeesEntity> query = session.createQuery(criteriaQuery);
    return query.getResultList();
  }

  public EmployeesEntity update(EmployeesEntity employee) {
    Session session = sessionFactory.getCurrentSession();
    EmployeesEntity origin = session.byId(EmployeesEntity.class).load(employee.getId());
    origin.setFirstName(employee.getFirstName());
    origin.setLastName(employee.getLastName());
    origin.setMiddleName(employee.getMiddleName());
    origin.setSex(employee.getSex());
    session.flush();
    return employee;
  }

  public long delete(long id) {
    Session session = sessionFactory.getCurrentSession();
    EmployeesEntity origin = session.byId(EmployeesEntity.class).load(id);
    session.delete(origin);
    return id;
  }
}
