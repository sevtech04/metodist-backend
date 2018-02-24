package com.hav.metodist.controllers.dictionary;


import com.hav.metodist.dao.models.EmployeesEntity;
import com.hav.metodist.models.common.CommonResponseModel;
import com.hav.metodist.models.dao.dictionary.DaoEmployeeModel;
import com.hav.metodist.models.response.dictionary.EmployeeModel;
import com.hav.metodist.service.interfaces.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeController {
  @Autowired
  private EmployeeServiceInterface employeeService;

  @PostMapping("/data/employees")
  public ResponseEntity<CommonResponseModel> save(@RequestBody EmployeesEntity employee){
    long id = employeeService.save(employee);
    CommonResponseModel model = new CommonResponseModel(true,employee,"New employee created, id:" + id);
    return ResponseEntity.ok().body(model);
  }

  @GetMapping("/data/employees/{id}")
  public ResponseEntity<CommonResponseModel> get(@PathVariable("id") long id){
    CommonResponseModel model = new CommonResponseModel(true, employeeService.get(id),"");
    return ResponseEntity.ok().body(model);
  }



  @PutMapping("/data/employees")
  public ResponseEntity<CommonResponseModel> update(@RequestBody EmployeesEntity employee){
    CommonResponseModel model = new CommonResponseModel(true, employeeService.update(employee),"");
    return ResponseEntity.ok().body(model);
  }

  @DeleteMapping("/data/employees/{id}")
  public ResponseEntity<CommonResponseModel> delete(@PathVariable("id") long id){
    CommonResponseModel model = new CommonResponseModel(true, employeeService.delete(id),"");
    return ResponseEntity.ok().body(model);
  }
}
