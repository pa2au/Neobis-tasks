package com.example.week6.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "kulikovsky")
public class Kulikovksy {
        @GeneratedValue()
        @Id
        @Column(name = "id", updatable = false, nullable = false)
        private int id;

        @Column(name = "name",nullable = false)
        private String name;

        @Column(name = "type")
        private String type;

        @Column(name = "shape")
        private String shape;

        @Column(name = "price")
        private double price;
        @JsonFormat(pattern="yyyy-MM-dd")
        @Column(name = "dateOfManufacture ")
        private Date dateOfManufacture ;
        @JsonFormat(pattern="yyyy-MM-dd")
        @Column(name = "dateOfExpiration ")
        private Date dateOfExpiration ;


}
