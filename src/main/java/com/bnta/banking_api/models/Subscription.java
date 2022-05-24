package com.bnta.banking_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "subscriptions")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate date_of_payment;

    @Column
    private String category;

    @Column
    private Float price;

    @Column
    private Boolean is_active;

    @ManyToOne
    @JoinColumn(name = "basic_accounts_id")
    private Account account;
//    @JsonIgnoreProperties({""})


// Empty/Default Constructor

    protected Subscription() {
    }

// Constructors

    public Subscription(String name, LocalDate date_of_payment, String category, Float price, Boolean is_active, Account account) {
        this.name = name;
        this.date_of_payment = date_of_payment;
        this.category = category;
        this.price = price;
        this.is_active = is_active;
        this.account = account;
    }


// Getters and Setters


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate_of_payment() {
        return date_of_payment;
    }

    public void setDate_of_payment(LocalDate date_of_payment) {
        this.date_of_payment = date_of_payment;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
