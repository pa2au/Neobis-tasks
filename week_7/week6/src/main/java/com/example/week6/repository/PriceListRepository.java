package com.example.week6.repository;

import com.example.week6.entity.PriceListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceListRepository extends JpaRepository <PriceListEntity, Integer>{
}
