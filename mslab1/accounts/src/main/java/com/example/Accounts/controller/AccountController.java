package com.example.Accounts.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @GetMapping("accounts/{ID}")
    public String getAccount(@PathVariable String ID) {
        return "hi there";
    }

}
