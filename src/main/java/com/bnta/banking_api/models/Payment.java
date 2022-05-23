package com.bnta.banking_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;

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
    private Timestamp date;

    @Column
    private Float amount;

    @ManyToOne
    @JoinColumn(name = "account_id")
    @JsonIgnoreProperties(value = "payments")

    private List<BasicAccount> basicAccount;

    public Payment(String name, Timestamp date, Float amount) {
        this.name = name;
        this.date = date;
        this.amount = amount;
        this.basicAccount = basicAccount;
        this.basicAccount = new ArrayList<BasicAccount>();
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

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public List<BasicAccount> getBasicAccount() {
        return basicAccount;
    }

    public void setBasicAccount(List<BasicAccount> basicAccount) {
        this.basicAccount = basicAccount;
    }
}
