package com.example.week6.service;

import com.example.week6.entity.SaleEntity;
import com.example.week6.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
@Autowired
    private SaleRepository saleRepository;

    public List<SaleEntity> getAll() {
        return saleRepository.findAll();
    }
}
