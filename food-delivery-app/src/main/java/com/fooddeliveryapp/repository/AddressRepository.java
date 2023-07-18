package com.fooddeliveryapp.repository;

import com.fooddeliveryapp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
