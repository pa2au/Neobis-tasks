package com.example.week6.repository;

import com.example.week6.entity.ProductTypesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypesRepository extends JpaRepository<ProductTypesEntity, Integer> {
}
