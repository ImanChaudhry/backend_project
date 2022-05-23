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
    @JoinColumn(name = "payment_id")
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
    @JoinColumn(name = "subscription_id")
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

    public Long getId() {
        return id;
    }

    public boolean isDebit() {
        return isDebit;
    }

    public float getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getCvc() {
        return cvc;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setDebit(boolean debit) {
        isDebit = debit;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }


    // add and remove payments and subscriptions
    public void addPayment(Payment payment){
        this.payments.add(payment);
    }

    public void removePayment(Payment payment){
        this.payments.remove(payment);
    }

    public void addSubscription(Subscription subscription){
        this.subscriptions.add(subscription);
    }

    public void removeSubscription(Subscription subscription){
        this.subscriptions.remove(subscription);
    }
}
