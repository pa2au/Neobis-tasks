package com.example.week6.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaleModel {
    private Long id;
    private Long client_id;
    private Long product_id;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateOfSale;

    @Override
    public String toString() {
        return "SaleModel{" +
                "id=" + id +
                ", client_id='" + client_id + '\'' +
                ", product_id='" + product_id + '\'' +
                ", dateOfSale='" + dateOfSale + '\'' +
                '}';
    }

}
