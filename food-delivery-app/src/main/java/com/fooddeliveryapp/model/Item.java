package com.fooddeliveryapp.model;

import javax.persistence.*;

public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer itemId;
    private String itemName;
    private Integer quantity;
    private Double cost;


    @OneToOne(cascade = CascadeType.ALL)
    private Category category;

}