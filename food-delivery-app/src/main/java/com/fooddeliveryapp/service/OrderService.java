package com.fooddeliveryapp.service;

import com.fooddeliveryapp.model.Item;
import com.fooddeliveryapp.model.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);//read

    Order getOrder(Integer orderId);//read

    Order updateOrder(Order order, Integer orderId);//update

    void deleteOrder(Integer orderId);//

    List<Item> getOrdersByCustomer(Integer customerId);


}