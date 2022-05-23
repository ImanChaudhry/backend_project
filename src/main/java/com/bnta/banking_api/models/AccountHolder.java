package com.bnta.banking_api.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class AccountHolder {

    private Long id;

    private String name;

    private LocalDate dob;

    private String address;

    private String employment_status;

    private List<BasicAccount> accounts;

    public AccountHolder(){}

    public AccountHolder(Long id, String name, LocalDate dob, String address, String employment_status, List<BasicAccount> accounts) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.employment_status = employment_status;
        this.accounts = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmployment_status() {
        return employment_status;
    }

    public void setEmployment_status(String employment_status) {
        this.employment_status = employment_status;
    }

    public List<BasicAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BasicAccount> accounts) {
        this.accounts = accounts;
    }


}
