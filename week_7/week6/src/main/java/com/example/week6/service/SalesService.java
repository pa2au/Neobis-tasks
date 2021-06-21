package com.example.week6.service;

import com.example.week6.entity.SalesEntity;
import com.example.week6.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {
@Autowired
    private SalesRepository salesRepository;

    public List<SalesEntity> getAll() {
        return salesRepository.findAll();
    }
}
