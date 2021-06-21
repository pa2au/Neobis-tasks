package com.example.week6.controller;

import com.example.week6.entity.SalesEntity;
import com.example.week6.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")

public class SalesController {

    @Autowired
        private SalesService salesService;

    @GetMapping
        public Iterable<SalesEntity> getAll() {
            Iterable<SalesEntity> values =  salesService.getAll();
            return values;
        }
}
