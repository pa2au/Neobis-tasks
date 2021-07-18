package com.example.week6.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor

@Table(name = "sale")
public class SaleEntity {
    @Id
    @Column(name = "id", updatable = false, nullable = false)

    @SequenceGenerator(name = "sale_seq", sequenceName = "sale_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sale_seq")

    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private ClientEntity clients;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private ProductEntity products;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateOfSale;
}
