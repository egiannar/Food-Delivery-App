package com.fooddeliveryapp.repository;

import com.fooddeliveryapp.model.FoodCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodCartRepository extends JpaRepository<FoodCart, Integer> {
}
