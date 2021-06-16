package com.example.week6.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Getter
@Setter
public class kulikovskyModel {
    private int id;
    private String name;
    private String type ;
    private String shape;
    private double price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfManufacture ;
    private Date dateOfExpiration ;

}
