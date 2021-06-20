package com.example.week6.service;

import com.example.week6.entity.ProductsEntity;
import com.example.week6.model.ProductsModel;
import com.example.week6.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<ProductsEntity> getAll() {
        return productsRepository.findAll();
    }

    public Optional<ProductsEntity> findById(Integer id) {
        return productsRepository.findById(id);
    }
    public String deleteById(Integer id) {
        productsRepository.deleteById(id);
        return id + " was deleted";
    }


    public void addNewCake(ProductsModel model){
        ProductsEntity cake = new ProductsEntity();
        cake.setId(model.getId());
        cake.setName(model.getName());
        cake.setType(model.getType());
        cake.setShape(model.getShape());
        cake.setPrice(model.getPrice());
        cake.setDateOfManufacture(model.getDateOfManufacture());
        cake.setDateOfExpiration(model.getDateOfExpiration());

        productsRepository.save(cake);
        //"new cake was added"
    }

    public void updateById(int id, ProductsModel model) throws Exception {

        Optional<ProductsEntity> cake = productsRepository.findById(id);
        if(cake.isPresent()) {
            ProductsEntity updateCake = cake.get();

            updateCake.setId(model.getId());
            updateCake.setName(model.getName());
            updateCake.setType(model.getType());
            updateCake.setShape(model.getShape());
            updateCake.setPrice(model.getPrice());
            updateCake.setDateOfManufacture(model.getDateOfManufacture());
            updateCake.setDateOfExpiration(model.getDateOfExpiration());

            productsRepository.save(updateCake);
            //"cake was updated";
        }
    }
}
