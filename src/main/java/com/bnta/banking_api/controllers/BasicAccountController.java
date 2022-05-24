package com.bnta.banking_api.controllers;

import com.bnta.banking_api.models.BasicAccount;
import com.bnta.banking_api.repositories.BasicAccountRepository;
import com.bnta.banking_api.repositories.PaymentRepository;
import com.bnta.banking_api.repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("basic_accounts")
public class BasicAccountController {

    @Autowired
    BasicAccountRepository basicAccountRepository;

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    SubscriptionRepository subscriptionRepository;

//    INDEX
//    @GetMapping
//    public ResponseEntity<List<BasicAccount>> getBasicAccounts(){
//        return new ResponseEntity<>(basicAccountRepository.findAll(), HttpStatus.OK);
//    }
    @GetMapping
    public ResponseEntity<List<BasicAccount>> getBasicAccountsAndFilter(
            @RequestParam(required = false, name = "pinnumber") String pinNumber,
            @RequestParam(required = false, name = "balance") double balance){
        if (pinNumber != null && balance != 0){
            return new ResponseEntity<>(basicAccountRepository.findBasicAccountByPinNumberAndBalance(pinNumber, balance), HttpStatus.OK);
        }

        return new ResponseEntity<>(basicAccountRepository.findAll(), HttpStatus.OK);
    }

//    SHOW
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<BasicAccount>> getBasicAccount(@PathVariable Long id){
        return new ResponseEntity<>(basicAccountRepository.findById(id), HttpStatus.OK);
    }
//    @GetMapping(value = "/{pinnumber}")//localhost:8080/basic_accounts?pinnumber=1548
//    public ResponseEntity<Optional<BasicAccount>> getBasicAccount(@PathVariable Long pinNumber){
//        return new ResponseEntity<>(basicAccountRepository.findById(pinNumber), HttpStatus.OK);
//    }

//    CREATE/POST
    @PostMapping
    public ResponseEntity<BasicAccount> createBasicAccount(@RequestBody BasicAccount newBasicAccount){
        basicAccountRepository.save(newBasicAccount);
        return new ResponseEntity<>(newBasicAccount, HttpStatus.CREATED);
    }

//    DELETE
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> removeBasicAccount(@PathVariable("id") Long id){
        Optional<BasicAccount> name = basicAccountRepository.findById(id);
        if (name.isPresent()){
            BasicAccount bAcc = name.get();
            bAcc.getPayments().stream().forEach(payment -> paymentRepository.deleteById(payment.getId()));
            bAcc.getSubscriptions().stream().forEach(subscription -> subscriptionRepository.deleteById(subscription.getId()));
            bAcc.setPayments(new ArrayList<>());
            bAcc.setSubscriptions(new ArrayList<>());
//            System.out.println(bAcc.getPayments().size());
            basicAccountRepository.deleteById(id);
        }
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Long> removeBasicAccount(@PathVariable("id") Long id){
//        basicAccountRepository.deleteById(id);
//        for (int i = 0; i <= basicAccountRepository.count(); i++){
//            if (id == null){
//                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
//            }
//        }
//        return new ResponseEntity<>(id, HttpStatus.OK);
//    }

//    UPDATE
//    @PutMapping
//    public ResponseEntity<BasicAccount> updateBasicAccount(@PathVariable Long id, @RequestBody BasicAccount basicAccountUpdate){
//        var bAccount = basicAccountRepository.findById(id);
//        if (bAccount.isPresent()){
//            BasicAccount basAccount = bAccount.get();
//            basAccount.setAccountHolder(basAccount.getAccountHolder());
//        }
//    }

}
