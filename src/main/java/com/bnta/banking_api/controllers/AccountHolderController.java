package com.bnta.banking_api.controllers;


import com.bnta.banking_api.models.Account;
import com.bnta.banking_api.models.AccountHolder;
import com.bnta.banking_api.repositories.AccountHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/{id}")        // localhost:8080/account_holder/1
    public ResponseEntity<Optional<AccountHolder>> getAccountHolder(@PathVariable Long id){
        return new ResponseEntity<>(accountHolderRepository.findById(id), HttpStatus.OK);
    }

// DELETE

//    @DeleteMapping(value = "/{account_id}")
//    public ResponseEntity<Long> removeBasicAccount(@PathVariable ("account_id") Long id) {
//        Optional<AccountHolder> name = accountHolderRepository.findById(id);
//        if (
//
//        AccountHolderRepository.delbyId(id);
//        return new ResponseEntity<>(id, HttpStatus.OK);
//    }




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
