package com.fooddeliveryapp.model;



import javax.persistence.*;
import java.util.List;


@Entity
public class FoodCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;

    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;

    @OneToOne(targetEntity = Item.class, cascade = CascadeType.ALL)
    private List<Item> itemList;


}