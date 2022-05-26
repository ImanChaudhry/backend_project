package com.bnta.banking_api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "account_holders")
public class AccountHolder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate dob;

    @Column
    private String address;

    @Column
    @Enumerated(EnumType.STRING)
    private Employment employmentStatus;

    @ManyToMany(mappedBy = "accountHolders")
<<<<<<< HEAD
    @JsonIgnoreProperties("accountHolders")
=======
<<<<<<< HEAD
    @JsonIgnoreProperties(value = "accountHolders")
=======
    @JsonIgnoreProperties("accountHolders")
>>>>>>> 11c3057e4664165678d7fef2d580a1d4f221f3aa
>>>>>>> 8c24c2d00ff2948730d94cb04d9519e22f428f17
    private List<Account> accounts;

//    DEFAULT CONSTRUCTOR
    protected AccountHolder(){}

//    CONSTRUCTOR
    public AccountHolder(String name, LocalDate dob, String address, Employment employmentStatus) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.employmentStatus = employmentStatus;
        this.accounts = new ArrayList<Account>();
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

    public Employment getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(Employment employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccounts(Account account){
        this.accounts.add(account);
    }

    public void removeAccount(Account account){
        this.accounts.remove(account);
    }

}
