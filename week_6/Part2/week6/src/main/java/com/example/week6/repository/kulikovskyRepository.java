package com.example.week6.repository;

import com.example.week6.entity.kulikovksy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface kulikovskyRepository extends JpaRepository <kulikovksy, Integer>  {
}
