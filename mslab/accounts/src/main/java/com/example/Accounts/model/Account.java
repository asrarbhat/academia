package com.example.Accounts.model;

import javax.persistence.*;

@Entity
@Table 
public class Account {

    @Id
    @GeneratedValue
    private Long Id;
    @Column
    private String accountnumber;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String age;
    @Column
    private String balance;
    public Long getId() {
        return Id;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAge() {
        return age;
    }

    public String getBalance() {
        return balance;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }



}

