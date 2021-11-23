package com.example.Accounts.repository;

import com.example.Accounts.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Account, Long> {
    Account findByAccountnumber(String accountnumber);
}
