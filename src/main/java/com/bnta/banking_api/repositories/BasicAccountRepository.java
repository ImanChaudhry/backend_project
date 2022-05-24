package com.bnta.banking_api.repositories;

import com.bnta.banking_api.models.BasicAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicAccountRepository extends JpaRepository<BasicAccount, Long> {

}
