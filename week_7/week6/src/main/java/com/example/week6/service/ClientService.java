package com.example.week6.service;

import com.example.week6.entity.ClientEntity;
import com.example.week6.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<ClientEntity> getAll() {
        return clientRepository.findAll();
    }
}
