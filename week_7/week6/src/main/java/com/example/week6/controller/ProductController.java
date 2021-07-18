package com.example.week6.controller;

import com.example.week6.entity.ProductEntity;
import com.example.week6.enums.ResultCode;
import com.example.week6.model.ProductModel;
import com.example.week6.model.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.week6.service.ProductService;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;


//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }

    @GetMapping("/getAll")
    public ResponseMessage getAll() {
        List<ProductEntity> values =  productService.getAll();
        return new ResponseMessage(values,ResultCode.SUCCESS, null);
    }

    @GetMapping("/getID/{id}")
    public ResponseMessage get(@PathVariable("id") Long id) {
        try {
            ProductModel product = productService.getID(id);
            return new ResponseMessage(product, ResultCode.SUCCESS, null);
        } catch (Exception ex) {
            return new ResponseMessage(null, ResultCode.NOT_FOUND, ex.getMessage());
        }
    }

    @PostMapping("/add")
    public ResponseMessage addNewValue(@RequestBody ProductModel productModel){
        ProductEntity product = productService.addNewValue(productModel);
        return new ResponseMessage(product, ResultCode.SUCCESS, null);
    }


    @PutMapping("/update/{id}")
    public ResponseMessage update(@PathVariable("id") Long id, @RequestBody ProductModel value) {
        try{
            ProductEntity product = productService.updateById(id, value);
            return new ResponseMessage(product, ResultCode.SUCCESS, null);
        } catch (Exception ex) {
            return new ResponseMessage(null, ResultCode.NOT_FOUND, ex.getMessage());
        }
    }


    @DeleteMapping("/delete/{id}")
    public ResponseMessage remove(@PathVariable("id") Long id){
        try{
            productService.deleteById(id);
            return new ResponseMessage("(Product) deleted with id: " + id, ResultCode.SUCCESS, null);
        } catch (Exception ex) {
            return new ResponseMessage(null, ResultCode.NOT_FOUND, ex.getMessage());
        }
    }
}
