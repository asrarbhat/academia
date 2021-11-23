package com.example.Accounts.service;

import com.example.Accounts.model.Account;
import com.example.Accounts.repository.AccountsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountsRepository repo;
    public AccountService(AccountsRepository repo) {
        this.repo = repo;
    }

    public Account get(String ID) {
        return repo.findByAccountnumber(ID);
    }


    public Account create(Account acc) {
        return repo.save(acc);
    }
}
