package com.fooddeliveryapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


public class Restaurant {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer restaurantId;
    private String restaurantName;


    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(targetEntity = Item.class,cascade = CascadeType.ALL)
    private List<Item> itemList = new ArrayList<>();

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }


}
