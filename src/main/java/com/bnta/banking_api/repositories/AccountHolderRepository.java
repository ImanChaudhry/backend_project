package com.bnta.banking_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bnta.banking_api.models.AccountHolder;

public interface AccountHolderRepository extends JpaRepository<AccountHolder, Long> {
}
