package com.bnta.banking_api.repositories;

import com.bnta.banking_api.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
