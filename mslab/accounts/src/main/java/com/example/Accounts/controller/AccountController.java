package com.example.Accounts.controller;

import com.example.Accounts.model.Account;
import com.example.Accounts.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    private final AccountService ser;

    public AccountController(AccountService ser) {
        this.ser = ser;
    }

    @GetMapping("accounts/get/{ID}")
    public Account getAccount(@PathVariable String ID) {
        return ser.get(ID);
    }

    @PostMapping("accounts/create")
    public Account createAccount(@RequestBody Account ac) {
        return ser.create(ac);
    }

    @GetMapping("accounts/update/{ac}/{tr}")
    public String update(@PathVariable String ac,@PathVariable String tr) {
        Account aa=ser.get(ac);
        var k=Integer.parseInt(aa.getBalance());
        var d=Integer.parseInt(tr);
        var r=k+d;

        aa.setBalance(Integer.toString(r));
        ser.create(aa);
        System.out.println(aa.getBalance());
        return "done";
    }


}
