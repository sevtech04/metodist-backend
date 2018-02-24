package com.hav.metodist.service.interfaces;

import com.hav.metodist.dao.models.EmployeesEntity;
import com.hav.metodist.models.dao.dictionary.DaoEmployeeModel;


import java.util.List;

public interface EmployeeServiceInterface {

  long save(EmployeesEntity employee);
  EmployeesEntity get(long id);
  List<EmployeesEntity> list();
  EmployeesEntity update(EmployeesEntity employee);
  long delete(long id);
}
