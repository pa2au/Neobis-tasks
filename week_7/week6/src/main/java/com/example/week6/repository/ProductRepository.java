package com.example.week6.repository;

import com.example.week6.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <ProductEntity, Long>  {
}
