package com.example.week6.entity;

import com.example.week6.model.ProductModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class ProductEntity {
        @Id
        @Column(name = "id", updatable = false, nullable = false)

        @SequenceGenerator(name = "product_seq", sequenceName = "product_seq", allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "type")
        private String type;

        @Column(name = "shape")
        private String shape;

        @Column(name = "price")
        private Double price;

        @JsonFormat(pattern="yyyy-MM-dd")
        @Column(name = "dateOfManufacture ")
        private Date dateOfManufacture ;

        @Column(name = "dateOfExpiration ")
        private Date dateOfExpiration ;

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
        @JoinColumn(name = "product_id")
        private List<SaleEntity> sales = new ArrayList<>();

        public ProductModel toModel() {
                return ProductModel.builder()
                        .id(this.id)
                        .name(this.name)
                        .dateOfExpiration(this.dateOfExpiration)
                        .dateOfManufacture(this.dateOfManufacture)
                        .shape(this.shape)
                        .type(this.type)
                        .price(this.price)
                        .build();
        }

        @Override
        public String toString() {
                return "ProductEntity{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", type='" + type + '\'' +
                        ", shape='" + shape + '\'' +
                        ", price=" + price +
                        ", dateOfManufacture=" + dateOfManufacture +
                        ", dateOfExpiration=" + dateOfExpiration +
                        ", sales=" + sales +
                        '}';
        }
}
