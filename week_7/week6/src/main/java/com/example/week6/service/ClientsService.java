package com.example.week6.service;

import com.example.week6.entity.ClientsEntity;
import com.example.week6.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsService {
    @Autowired
    private ClientsRepository clientsRepository;

    public List<ClientsEntity> getAll() {
        return clientsRepository.findAll();
    }
}
