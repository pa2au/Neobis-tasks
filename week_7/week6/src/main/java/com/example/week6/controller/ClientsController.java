package com.example.week6.controller;

import com.example.week6.entity.ClientsEntity;
import com.example.week6.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientsController {
    @Autowired
    private ClientsService clientsService;

    @GetMapping
    public Iterable<ClientsEntity> getAll() {
        Iterable<ClientsEntity> values =  clientsService.getAll();
        return values;
    }
}
