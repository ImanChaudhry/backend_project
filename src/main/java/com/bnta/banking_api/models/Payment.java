package com.bnta.banking_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate date;

    @Column
    private Float amount;

    @Column
    private Category category;

    @ManyToOne
    @JoinColumn(name = "account_id")
    @JsonIgnoreProperties(value = "payments")
    private Account account;

    public Payment(String name, LocalDate date, Float amount, Account account) {
        this.name = name;
        this.date = date;
        this.amount = amount;
        this.account = account;
    }

    protected Payment() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setBasicAccount(Account account) {
        this.account = account;
    }
}
