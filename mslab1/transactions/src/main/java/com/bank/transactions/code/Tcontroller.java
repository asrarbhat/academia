package com.bank.transactions.code;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Tcontroller {

    @GetMapping("/transactions/get/{ID}")
    public List<String> get(@PathVariable String ID) {
        return List.of("hi","there","how");
    }

}
