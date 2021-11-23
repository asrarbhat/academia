package com.bank.transactions.code;

import javax.persistence.*;

@Entity
@Table
public class Tmodel {
    @Id
    @GeneratedValue
    private Long Id;
    @Column
    private String accountnumber;
    @Column
    private String transaction;
    public Tmodel()
    {

    }
    public Tmodel(Long id,String string1, String string2) {
        accountnumber=string1;
        transaction=string2;
        this.Id=id;
    }


    public void setTransaction(String id) {
        this.transaction = id;
    }
    public String getAccountnumber(){
        return this.accountnumber;
    }
    public String getTransaction(){
        return this.transaction;
    }
    public void setId(Long id) {
        this.Id = id;
    }

    public void setAccountnumber(String publisher) {
        this.accountnumber = publisher;
    }
}

