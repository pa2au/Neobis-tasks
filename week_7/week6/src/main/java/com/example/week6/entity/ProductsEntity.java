package com.example.week6.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class ProductsEntity {
        @GeneratedValue()
        @Id
        @Column(name = "id", updatable = false, nullable = false)
        private int id;

        @JoinColumn(name = "name")
        @ManyToOne
        private ProductNamesEntity name;

        @JoinColumn(name = "type")
        @ManyToOne
        private ProductTypesEntity type;

        @Column(name = "shape")
        private String shape;

        @JoinColumn(name = "price")
        @ManyToOne
        private PriceListEntity price;

        @JsonFormat(pattern="yyyy-MM-dd")
        @Column(name = "dateOfManufacture ")
        private Date dateOfManufacture ;

        @Column(name = "dateOfExpiration ")
        private Date dateOfExpiration ;
}
