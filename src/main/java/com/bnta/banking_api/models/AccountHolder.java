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


}
