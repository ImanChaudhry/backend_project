package com.bnta.banking_api.models;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "joint_accounts")
public class JointAccount extends Account{

    @Column
    private String relationship;

    @ManyToMany//(mappedBy = "accounts")
    @JoinTable(
            name = "jointAccount_accountHolder",
            joinColumns = {@JoinColumn(name = "joint_account_id", nullable = true)},
            inverseJoinColumns = {@JoinColumn(name = "account_holder_id", nullable = true)}
    )
    private List<AccountHolder> accountHolders;

    public JointAccount(boolean isDebit, double balance, String pinNumber,
                        String relationship, List<AccountHolder> accountHolders) {

        super(isDebit, balance, pinNumber);
        this.relationship = relationship;
        this.accountHolders = accountHolders;
    }

    protected JointAccount() {
        super();
    }

    public List<AccountHolder> getAccountHolders() {
        return accountHolders;
    }

    public void setAccountHolders(List<AccountHolder> accountHolders) {
        this.accountHolders = accountHolders;
    }


    public void addAccountHolders(AccountHolder accountHolder) {
        this.accountHolders.add(accountHolder);
    }

    public void removeAccountHolders(AccountHolder accountHolder) {
        this.accountHolders.remove(accountHolder);
    }
}
