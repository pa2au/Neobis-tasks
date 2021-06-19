package com.example.week6.repository;

import com.example.week6.entity.Kulikovksy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KulikovskyRepository extends JpaRepository <Kulikovksy, Integer>  {
}
