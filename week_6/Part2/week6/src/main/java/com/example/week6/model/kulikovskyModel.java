package com.example.week6.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
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
    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "dateOfManufacture")
    private Date dateOfManufacture ;
    @Column(name = "dateOfExpiration")
    private Date dateOfExpiration ;

}
