//package com.bnta.banking_api.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity(name="basic_accounts")
//public class BasicAccount extends Account {
//
//    @ManyToOne
//    private AccountHolder accountHolder;
//
//    public BasicAccount(boolean isDebit, double balance, String pinNumber, AccountHolder accountHolder) {
//
//        super(isDebit, balance, pinNumber);
//        this.accountHolder = accountHolder;
//    }
//
//    protected BasicAccount(){
//        super();
//    }
//
//    public AccountHolder getAccountHolder() {
//        return accountHolder;
//    }
//
//    public void setAccountHolder(AccountHolder accountHolder) {
//        this.accountHolder = accountHolder;
//    }
//
//}