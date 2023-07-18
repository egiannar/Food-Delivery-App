package com.fooddeliveryapp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String street;
    private String number;
    private Long postalCode;

    public Address(String street, String number) {
        this.street = street;
        this.number = number;
    }


}