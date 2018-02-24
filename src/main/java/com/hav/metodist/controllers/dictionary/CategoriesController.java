package com.hav.metodist.controllers.dictionary;


import com.hav.metodist.models.common.CommonResponseModel;
import com.hav.metodist.dao.models.DaoCategoriesModel;
import com.hav.metodist.models.response.dictionary.CategoriesModel;
import com.hav.metodist.service.interfaces.CategoriesServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {

    @Autowired
    CategoriesServiceInterface categoriesService;

    @PostMapping("/data/dictionary/categories")
    public ResponseEntity<CommonResponseModel> save(@RequestBody DaoCategoriesModel category){
        long id = categoriesService.save(category);
        CommonResponseModel model = new CommonResponseModel(true,category,"");
        return ResponseEntity.ok().body(model);
    }

    @GetMapping("/data/dictionary/categories/{id}")
    public ResponseEntity<CommonResponseModel> get(@PathVariable("id") long id){
        CommonResponseModel model = new CommonResponseModel(true, categoriesService.get(id),"");
        return ResponseEntity.ok().body(model);
    }

    @GetMapping("/data/dictionary/categories")
    public ResponseEntity<CommonResponseModel> list(){
        List<DaoCategoriesModel> list = categoriesService.list();
        ArrayList<CategoriesModel> res = new ArrayList<>(list.size());
        for (DaoCategoriesModel el : list){
            res.add(new CategoriesModel(el));
        }
        CommonResponseModel model = new CommonResponseModel(true, res,"");
        return ResponseEntity.ok().body(model);
    }

    @PutMapping("/data/dictionary/categories")
    public ResponseEntity<CommonResponseModel> update(@RequestBody DaoCategoriesModel category){
        CommonResponseModel model = new CommonResponseModel(true, categoriesService.update(category),"");
        return ResponseEntity.ok().body(model);
    }

    @DeleteMapping("/data/dictionary/categories/{id}")
    public ResponseEntity<CommonResponseModel> delete(@PathVariable("id") long id){
        CommonResponseModel model = new CommonResponseModel(true, categoriesService.delete(id),"");
        return ResponseEntity.ok().body(model);
    }
}
