package com.bnta.banking_api.repositories;

import com.bnta.banking_api.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findJointAccountByRelationshipIsContainingIgnoreCase(String relationship);
    List<Account> findBasicAccountByPinNumberAndBalance(String pinNumber, double balance);
    List<Account> findAccountByBalanceGreaterThan(double balance);


=======
public interface AccountRepository extends JpaRepository<Account, Long> {

>>>>>>> 9ac571282553c5d3289bac4da070765ae5d32d3d
}
