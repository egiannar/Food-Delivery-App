package com.fooddeliveryapp.repository;

import com.fooddeliveryapp.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
