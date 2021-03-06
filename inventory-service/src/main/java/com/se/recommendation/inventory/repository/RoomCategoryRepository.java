package com.se.recommendation.inventory.repository;

import com.se.recommendation.inventory.model.Pricing;
import com.se.recommendation.inventory.model.RoomCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomCategoryRepository extends JpaRepository<RoomCategory,Long> {
}
