package com.fooddeliveryapp.repository;

import com.fooddeliveryapp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {


}