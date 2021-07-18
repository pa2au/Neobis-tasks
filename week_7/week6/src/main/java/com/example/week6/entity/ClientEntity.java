package com.example.week6.entity;

import com.example.week6.enums.Sex;
import com.example.week6.model.ClientModel;
import com.example.week6.model.ProductModel;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "client")
public class ClientEntity {
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @SequenceGenerator(name = "client_seq", sequenceName = "client_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
    private Long id;

    @Column
    private String firstName;
    @Column
    private String lastName;

    @Column
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Column
    private String phoneNumber;

    @Column
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateOfBirth;

    @Column
    private Date dateOfRegistration;

    @Column
    private String address;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "client_id")
    private List<SaleEntity> saleEntityList = new ArrayList<>();

    public ClientModel toModel() {
        return ClientModel.builder()
                .id(this.id)
                .firstName(this.firstName)
                .lastName(this.lastName)
                .sex(this.sex)
                .phoneNumber(this.phoneNumber)
                .dateOfBirth(this.dateOfBirth)
                .dateOfRegistration(this.dateOfRegistration)
                .address(this.address)
                .build();
    }

}
