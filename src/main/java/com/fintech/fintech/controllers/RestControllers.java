package com.fintech.fintech.controllers;

import com.fintech.fintech.classes.finhub.CompanyNews;
import com.fintech.fintech.classes.finhub.CompanyProfile2;
import com.fintech.fintech.classes.finhub.StockSymbols;
import com.fintech.fintech.classes.finhub.symbollookup.SymbolLookup;
import org.springframework.web.bind.annotation.*;
import com.fintech.fintech.HTTP.*;
@RestController
public class RestControllers {
    @CrossOrigin
    @GetMapping("/test_api")
    public void testAPI(){
        System.out.println("Test Successfully");
        FinHubRequester req = new FinHubRequester();
        CompanyProfile2 s = req.getCompanyProfile2Json("GOOG");
        System.out.println(s.getExchange());
    }

    

}
