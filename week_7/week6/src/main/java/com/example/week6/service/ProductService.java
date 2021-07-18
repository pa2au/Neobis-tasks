package com.example.week6.service;

import com.example.week6.entity.ProductEntity;
import com.example.week6.model.ProductModel;
import com.example.week6.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    public ProductModel getID(Long id) throws Exception{

        ProductEntity product = productRepository.getById(id);


        if (product != null) {
           return product.toModel();
        } else {
            throw new Exception("(Product) not found with id: " + id);
        }

//        return productRepository.findById(id).orElseThrow(() -> new Exception(""));

    }

    public String deleteById(Long id) throws Exception {
        ProductEntity product = productRepository.getById(id);

        if (product != null) {
            productRepository.deleteById(id);
            return "(Product) with id: " + id+" was deleted";
        } else {
            throw new Exception("(Product) not found with id: " + id);
        }
    }


    public ProductEntity addNewValue(ProductModel model){
        ProductEntity product = new ProductEntity();
        product.setId(model.getId());
        product.setName(model.getName());
        product.setType(model.getType());
        product.setShape(model.getShape());
        product.setPrice(model.getPrice());
        product.setDateOfManufacture(model.getDateOfManufacture());
        product.setDateOfExpiration(model.getDateOfExpiration());
        return productRepository.save(product);


        //"new cake was added"
    }

    public ProductEntity updateById(Long id, ProductModel model) throws Exception {
        ProductEntity product = productRepository.getById(id);

        if (product != null) {
            product.setId(model.getId());
            product.setName(model.getName());
            product.setType(model.getType());
            product.setShape(model.getShape());
            product.setPrice(model.getPrice());
            product.setDateOfManufacture(model.getDateOfManufacture());
            product.setDateOfExpiration(model.getDateOfExpiration());
            return productRepository.save(product);
        } else {
            throw new Exception("(Product) not found with id: " + id);
        }
    }
}
