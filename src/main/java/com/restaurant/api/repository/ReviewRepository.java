package com.restaurant.api.repository;

import com.restaurant.api.model.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<ReviewModel, Integer> {
}
