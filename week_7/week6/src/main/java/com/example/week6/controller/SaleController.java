package com.example.week6.controller;

import com.example.week6.entity.ClientEntity;
import com.example.week6.entity.SaleEntity;
import com.example.week6.enums.ResultCode;
import com.example.week6.model.ResponseMessage;
import com.example.week6.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sale")

public class SaleController {

    @Autowired
        private SaleService saleService;

    @GetMapping
        public ResponseMessage getAll() {
            List<SaleEntity> saleEntities =  saleService.getAll();
            return new ResponseMessage(saleEntities, ResultCode.SUCCESS, null);
        }
}
