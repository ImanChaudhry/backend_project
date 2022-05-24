package com.bnta.banking_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="basic_accounts")
public class BasicAccount extends Account {

    @ManyToOne
    private AccountHolder accountHolder;

    public BasicAccount(boolean isDebit, float balance, String accountNumber,
                        String expirationDate, String cvc, String pinNumber, AccountHolder accountHolder) {

        super(isDebit, balance, accountNumber, expirationDate, cvc, pinNumber);
        this.accountHolder = accountHolder;
    }

    public BasicAccount(){
        super();
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }
}