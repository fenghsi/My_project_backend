package com.fintech.fintech.controllers;

import com.fintech.fintech.classes.finhub.CompanyNews;
import com.fintech.fintech.classes.finhub.CompanyProfile2;
import com.fintech.fintech.classes.finhub.StockSymbols;
import com.fintech.fintech.classes.finhub.symbollookup.SymbolLookup;
import com.fintech.fintech.models.user;
import com.fintech.fintech.repositories.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fintech.fintech.HTTP.*;
@RestController
public class RestControllers {

    @Autowired
    private userRepository repo;

    @CrossOrigin
    @GetMapping("/test_api")
    public void testAPI(){

    }

    

}
