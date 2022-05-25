package com.bnta.banking_api.controllers;


import com.bnta.banking_api.models.Account;
import com.bnta.banking_api.models.AccountHolder;
import com.bnta.banking_api.models.Employment;
import com.bnta.banking_api.repositories.AccountHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("account_holders")
public class AccountHolderController {

    @Autowired
    private AccountHolderRepository accountHolderRepository;


// INDEX

    @GetMapping
    public ResponseEntity<List<AccountHolder>> getAccountHolder (){
        return new ResponseEntity(accountHolderRepository.findAll(), HttpStatus.OK);
    }

// POST/CREATE

    @PostMapping
    public ResponseEntity<AccountHolder> createAccountHolder(@RequestBody AccountHolder newAccountHolder) {
        accountHolderRepository.save(newAccountHolder);
        return new ResponseEntity<>(newAccountHolder, HttpStatus.CREATED);
    }

// SHOW
    @GetMapping(value = "/id={id}")        // localhost:8080/account_holder/1
    public ResponseEntity<Optional<AccountHolder>> getAccountHolder(@PathVariable Long id){
        var accountHolder = accountHolderRepository.findById(id);
        return new ResponseEntity<>(accountHolder, accountHolder.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    @GetMapping(value = "/name={name}")        // localhost:8080/account_holder/name
    public ResponseEntity<Optional<AccountHolder>> getAccountHolderByName(@PathVariable String name) {
        var accountHolderByName = accountHolderRepository.findAccountHolderByName(name);
        return new ResponseEntity(accountHolderRepository, HttpStatus.OK);
    }
    @GetMapping(value = "/dob={dob}")        // localhost:8080/account_holder/dob
    public ResponseEntity<Optional<AccountHolder>> getAccountHolderByDob(@PathVariable LocalDate dob){
        var accountHolderByDob = accountHolderRepository.findAccountHolderByDob(dob);
        return new ResponseEntity(accountHolderRepository, HttpStatus.OK);
    }

    @GetMapping(value = "/address={address}")        // localhost:8080/account_holder/address
        public ResponseEntity<Optional<AccountHolder>> getAccountHolderByAddress(@PathVariable String address){
            var accountHolderByAddress = accountHolderRepository.findAccountHolderByAddress(address);
            return new ResponseEntity(accountHolderRepository, HttpStatus.OK);
    }

    @GetMapping(value = "/employment={employment_status}")        // localhost:8080/account_holder/employment_status
        public ResponseEntity<AccountHolder> getAccountHolderEmployment_Status(@PathVariable Employment employment_status){
            return new ResponseEntity(accountHolderRepository.findAccountHolderByEmployment_status(employment_status), HttpStatus.OK);
    }



// DELETE

    @DeleteMapping(value = "/id={id}")
    public ResponseEntity<Long> removeAccount(@PathVariable Long id) {
        Optional<AccountHolder> name = accountHolderRepository.findById(id);
        if (name.isPresent()) {
            AccountHolder accountHolder = name.get();
            try {
                List<Account> Account = accountHolder.getAccounts().stream()
                    .filter(account -> account.getClass()
                            .getName().equals("Account")).toList();
                for(Account a:Account);
            }
             catch (Exception exception){}
        }
        accountHolderRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);

    }


//        var accountholder = accountHolderRepository.findById(id);
//        if (accountholder.isEmpty()) {
//            return new ResponseEntity<>(id, HttpStatus.NOT_FOUND);
//        } else {
//            accountHolderRepository.delete(accountholder.get());
//            return new ResponseEntity<>(id, HttpStatus.OK);
//        }
//    }

//    List<Account> list1 = accountHolder.getAccount();


}
