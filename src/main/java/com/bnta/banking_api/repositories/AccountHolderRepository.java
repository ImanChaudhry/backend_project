package com.bnta.banking_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bnta.banking_api.models.AccountHolder;

import java.util.List;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Long> {


    List<AccountHolder> findAccountHolderById (Long id);

//    List<Account> list1 = accountHolder.getAccount();
}
