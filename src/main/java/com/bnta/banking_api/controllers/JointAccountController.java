package com.bnta.banking_api.controllers;

import com.bnta.banking_api.models.BasicAccount;
import com.bnta.banking_api.models.JointAccount;
import com.bnta.banking_api.repositories.JointAccountRepository;
import com.bnta.banking_api.repositories.PaymentRepository;
import com.bnta.banking_api.repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("joint_accounts")
public class JointAccountController {

    @Autowired
    JointAccountRepository jointAccountRepository;

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    SubscriptionRepository subscriptionRepository;

//    INDEX
//    @GetMapping
//    public ResponseEntity<List<JointAccount>> getJointAccounts(){
//        return new ResponseEntity<>(jointAccountRepository.findAll(), HttpStatus.OK);
//    }

    @GetMapping
    public ResponseEntity<List<JointAccount>>getJointAccountAndFilter(
            @RequestParam(required = false, name = "relationship") String relationship,
            @RequestParam(required = false, name = "balance", defaultValue = "0") double balance,
            @RequestParam(required = false, name = "pinnumber") String pinNumber){
        if (relationship != null){
            return new ResponseEntity<>(jointAccountRepository.findJointAccountByRelationshipIsContainingIgnoreCase(relationship), HttpStatus.OK);
        }
        if (pinNumber != null && balance != 0){
            return new ResponseEntity<>(jointAccountRepository.findBasicAccountByPinNumberAndBalance(pinNumber, balance), HttpStatus.OK);
        }
        return new ResponseEntity<>(jointAccountRepository.findAll(), HttpStatus.OK);
    }

//    SHOW
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<JointAccount>> getJointAccount(@PathVariable Long id){
        return new ResponseEntity<>(jointAccountRepository.findById(id), HttpStatus.OK);
    }

//    CREATE/POST
    @PostMapping
    public ResponseEntity<JointAccount> createJointAccount(@RequestBody JointAccount newJointAccount){
        jointAccountRepository.save(newJointAccount);
        return new ResponseEntity<>(newJointAccount, HttpStatus.CREATED);
    }

//    DELETE
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Long> removeJointAccount(@PathVariable("id") Long id){
//        jointAccountRepository.deleteById(id);
//        return new ResponseEntity<>(id, HttpStatus.OK);
//    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> removeJointAccount(@PathVariable("id") Long id){
        Optional<JointAccount> ja = jointAccountRepository.findById(id);
        if (ja.isPresent()){
            JointAccount jAcc = ja.get();
            jAcc.getPayments().stream().forEach(payment -> paymentRepository.deleteById(payment.getId()));
            jAcc.getSubscriptions().stream().forEach(subscription -> subscriptionRepository.deleteById(subscription.getId()));
            jAcc.setPayments(new ArrayList<>());
            jAcc.setSubscriptions(new ArrayList<>());
            jointAccountRepository.deleteById(id);
        }
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


}
