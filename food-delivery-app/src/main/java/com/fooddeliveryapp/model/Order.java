package com.fooddeliveryapp.model;


import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private LocalDateTime orderDate;
    private String paymentMethod;

    @OneToOne(cascade = CascadeType.ALL)
    private FoodCart cart;

    @OneToOne(cascade = CascadeType.ALL)
    private Bill bill;


    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public FoodCart getCart() {
        return cart;
    }

    public void setCart(FoodCart cart) {
        this.cart = cart;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
