package com.example.week6.model;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductModel {
    private Long id;
    private String name;
    private String type ;
    private String shape;
    private Double price;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateOfManufacture ;
    private Date dateOfExpiration ;

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", shape='" + shape + '\'' +
                ", price=" + price +
                ", dateOfManufacture=" + dateOfManufacture +
                ", dateOfExpiration=" + dateOfExpiration +
                '}';
    }
}
