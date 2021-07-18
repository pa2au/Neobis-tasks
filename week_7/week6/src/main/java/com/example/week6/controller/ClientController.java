package com.example.week6.controller;

import com.example.week6.entity.ClientEntity;
import com.example.week6.entity.ProductEntity;
import com.example.week6.enums.ResultCode;
import com.example.week6.model.ResponseMessage;
import com.example.week6.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public ResponseMessage getAll() {
        List<ClientEntity> clientEntities =  clientService.getAll();
        return new ResponseMessage(clientEntities, ResultCode.SUCCESS, null);
    }
}
