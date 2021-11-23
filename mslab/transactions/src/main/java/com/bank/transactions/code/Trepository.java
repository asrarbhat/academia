package com.bank.transactions.code;

import com.bank.transactions.code.Tmodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Trepository extends JpaRepository<Tmodel, Long> {
    List<Tmodel> findByAccountnumber(String accountnumber);
}
