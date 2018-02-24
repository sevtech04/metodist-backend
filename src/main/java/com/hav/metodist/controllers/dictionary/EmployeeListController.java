package com.hav.metodist.controllers.dictionary;

import com.hav.metodist.dao.models.EmployeesEntity;
import com.hav.metodist.models.common.CommonResponseModel;
import com.hav.metodist.service.interfaces.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class EmployeeListController {

    @Autowired
    private EmployeeServiceInterface employeeService;

    @GetMapping("/data/employees")
    public ResponseEntity<CommonResponseModel> list(){
        List<EmployeesEntity> list = employeeService.list();
        //ArrayList<EmployeeModel> res = new ArrayList<>(list.size());
        //for (DaoEmployeeModel el : list){
        //    res.add(new EmployeeModel(el));
        //}
        CommonResponseModel model = new CommonResponseModel(true, list,"");
        return ResponseEntity.ok().body(model);
    }
}
