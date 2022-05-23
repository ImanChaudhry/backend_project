package com.bnta.banking_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="basic_aacounts")
public class BasicAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_debit")
    private boolean isDebit;

    @Column(name = "balance")
    private float balance;

    @Column(name = "account_number", length = 8)
    private String accountNumber;

    @OneToMany(mappedBy = "basicAccount")
    @JsonIgnoreProperties(value = "basicAccount")
    private List<Payment> payments;

    @Column(name = "expiration_date", length = 4)
    private String expirationDate;

    @Column(name = "cvc", length = 3)
    private String cvc;

    @Column(name = "pin_number", length = 4)
    private String pinNumber;

    @ManyToOne
    private AccountHolder accountHolder;

    @OneToMany(mappedBy = "basicAccount")
    private List<Subscription> subscriptions;


    public BasicAccount(boolean isDebit, float balance, String accountNumber, String expirationDate, String cvc, String pinNumber, AccountHolder accountHolder) {
        this.isDebit = isDebit;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.payments = new ArrayList<>();
        this.expirationDate = expirationDate;
        this.cvc = cvc;
        this.pinNumber = pinNumber;
        this.accountHolder = accountHolder;
    }

    public BasicAccount(){}

    




}
