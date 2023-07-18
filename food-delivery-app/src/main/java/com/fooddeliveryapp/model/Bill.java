package com.fooddeliveryapp.model;


import javax.persistence.*;
import java.util.List;


@Table(name = "bills")
@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billId;
    private Customer customer;
    private Address deliveryAddress;
    private Restaurant restaurant;
    private List<Item> items;

    @OneToOne(cascade = CascadeType.ALL)
    private Order order;
    private double totalCost;
    private String billComments;


}
