package com.hav.metodist.service.dictionary;

import com.hav.metodist.dao.dictionary.EmployeeDao;
import com.hav.metodist.dao.models.EmployeesEntity;
import com.hav.metodist.models.dao.dictionary.DaoEmployeeModel;
import com.hav.metodist.service.interfaces.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class EmployeeService implements EmployeeServiceInterface{

  @Autowired
  EmployeeDao employeeDao;

  @Transactional
  public long save(EmployeesEntity employee) {
    return employeeDao.save(employee);
  }

  public EmployeesEntity get(long id) {
    return employeeDao.get(id);
  }

  public List<EmployeesEntity> list() {
    return employeeDao.list();
  }

  public EmployeesEntity update(EmployeesEntity employee) {
    return employeeDao.update(employee);
  }

  public long delete(long id) {
    return employeeDao.delete(id);
  }
}
