package com.bank.transactions.code;


import com.bank.transactions.code.Tmodel;
import com.bank.transactions.code.Tservice;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Tcontroller {
    private final Tservice service;

    public Tcontroller(Tservice service) {
        this.service = service;
    }

    @GetMapping("/transactions/get/{ID}")
    public List<Tmodel> get(@PathVariable String ID) {
        return service.get(ID);
    }

    @PostMapping("/transactions/create")
    public Tmodel create(@RequestBody Tmodel tr) {
        final String uri = "http://localhost:9000/accounts/update/"+tr.getAccountnumber()+"/"+tr.getTransaction();
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return service.create(tr);
    }

}
