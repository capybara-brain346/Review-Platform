package com.restaurant.api.repository;

import com.restaurant.api.model.RestaurantModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantModel, Integer> {
}
