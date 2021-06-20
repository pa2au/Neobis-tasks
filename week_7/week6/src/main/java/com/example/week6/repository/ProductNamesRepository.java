package com.example.week6.repository;

import com.example.week6.entity.ProductNamesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductNamesRepository extends JpaRepository <ProductNamesEntity, Integer>{
}
