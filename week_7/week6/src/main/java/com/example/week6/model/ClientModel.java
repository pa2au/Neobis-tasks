package com.example.week6.model;

import com.example.week6.enums.Sex;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientModel {

    private Long id;
    private String firstName;
    private String lastName;
    private Sex sex;
    private String phoneNumber;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateOfBirth;
    private Date dateOfRegistration;
    private String address;

    @Override
    public String toString() {
        return "ClientModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfRegistration=" + dateOfRegistration +
                ", address=" + address +
                '}';
    }
}
