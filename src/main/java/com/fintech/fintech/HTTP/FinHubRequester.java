package com.fintech.fintech.HTTP;

import com.fintech.fintech.classes.finhub.CompanyNews;
import com.fintech.fintech.classes.finhub.CompanyProfile2;
import com.fintech.fintech.classes.finhub.StockSymbols;
import com.fintech.fintech.classes.finhub.symbollookup.SymbolLookup;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

public class FinHubRequester {
    @Autowired
    private final RestTemplate restTemplate;
    private final HttpEntity<String> entity;

    public FinHubRequester() {
        String url ="https://finnhub.io";
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();
        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory(url));
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Finnhub-Token", "c1d94sf48v6p64722ac0");
        entity = new HttpEntity<String>(headers);
    }

    public CompanyNews[] getCompanyNewsJson(String symbol, String from, String to ) {
        String uri = "/api/v1/company-news?symbol="+symbol+"&from="+from+"&to="+to;
        ResponseEntity<CompanyNews[]> respEntity = restTemplate.exchange(uri, HttpMethod.GET, entity, CompanyNews[].class);
        return respEntity.getBody();
    }

    public StockSymbols[] getStockSymbolsJson() {
        String uri = "/api/v1/stock/symbol?exchange=US";
        ResponseEntity<StockSymbols[]> respEntity = restTemplate.exchange(uri, HttpMethod.GET, entity, StockSymbols[].class);
        return respEntity.getBody();
    }

    public SymbolLookup getSymbolLookupsJson(String q) {
        String uri = "api/v1/search?q="+q;
        ResponseEntity<SymbolLookup> respEntity = restTemplate.exchange(uri, HttpMethod.GET, entity, SymbolLookup.class);
        return respEntity.getBody();
    }

    public CompanyProfile2 getCompanyProfile2Json(String symbol) {
        String uri = "api/v1/stock/profile2?symbol="+symbol;
        ResponseEntity<CompanyProfile2> respEntity = restTemplate.exchange(uri, HttpMethod.GET, entity, CompanyProfile2.class);
        return respEntity.getBody();
    }



}
