package com.example.week6.repository;

import com.example.week6.entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository <ProductsEntity, Integer>  {
}
