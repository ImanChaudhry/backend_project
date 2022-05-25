//package com.bnta.banking_api.repositories;
//
//import com.bnta.banking_api.models.JointAccount;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.List;
//
//public interface JointAccountRepository extends JpaRepository<JointAccount, Long> {
//
//    List<JointAccount> findJointAccountByRelationshipIsContainingIgnoreCase(String relationship);
//    List<JointAccount> findBasicAccountByPinNumberAndBalance(String pinNumber, double balance);
//}
