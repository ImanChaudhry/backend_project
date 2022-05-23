package com.bnta.banking_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Timestamp;
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
    private Timestamp date_of_payment;

    @Column
    private String category;

    @Column
    private Float price;

    @Column
    private Boolean is_active;

    @ManyToOne
    @JoinColumn(name = "basic_accounts_id")
    private BasicAccount basicAccount;
//    @JsonIgnoreProperties({""})


// Empty/Default Constructor

    protected Subscription() {
    }

// Constructors

    public Subscription(String name, Timestamp date_of_payment, String category, Float price, Boolean is_active, BasicAccount basicAccount) {
        this.name = name;
        this.date_of_payment = date_of_payment;
        this.category = category;
        this.price = price;
        this.is_active = is_active;
        this.basicAccount = basicAccount;
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

    public Timestamp getDate_of_payment() {
        return date_of_payment;
    }

    public void setDate_of_payment(Timestamp date_of_payment) {
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

    public BasicAccount getBasicAccount() {
        return basicAccount;
    }

    public void setBasicAccount(BasicAccount basicAccount) {
        this.basicAccount = basicAccount;
    }

}
