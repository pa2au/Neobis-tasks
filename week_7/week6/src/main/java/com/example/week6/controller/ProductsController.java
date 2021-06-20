package com.example.week6.controller;

import com.example.week6.entity.ProductsEntity;
import com.example.week6.model.ProductsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.week6.service.ProductsService;

@RestController
@RequestMapping(path = "/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/getAll")

    public Iterable<ProductsEntity> getAll() {
        Iterable<ProductsEntity> values =  productsService.getAll();
        return values;
    }


    @PostMapping("/add")
    public String  addNewCake(@RequestBody ProductsModel cake){
        productsService.addNewCake(cake);
        return "new cake was added";
    }


    @PutMapping("/update/{id}")
    public String update(@PathVariable("id") int id, @RequestBody ProductsModel cake) throws Exception {
        productsService.updateById(id, cake);
        return "cake was updated";
    }

    @DeleteMapping("/delete/{id}")
    public String remove(@PathVariable("id") int id){
        productsService.deleteById(id);
        return "cake was deleted";
    }
}
