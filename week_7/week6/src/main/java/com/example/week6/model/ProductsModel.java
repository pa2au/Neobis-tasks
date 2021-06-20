package com.example.week6.model;

import com.example.week6.entity.PriceListEntity;
import com.example.week6.entity.ProductNamesEntity;
import com.example.week6.entity.ProductTypesEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductsModel {
    private int id;
    private ProductNamesEntity name;
    private ProductTypesEntity type ;
    private String shape;
    private PriceListEntity price;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateOfManufacture ;
    private Date dateOfExpiration ;

}
