package com.bnta.banking_api.repositories;

import com.bnta.banking_api.models.BasicAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BasicAccountRepository extends JpaRepository<BasicAccount, Long> {


}
