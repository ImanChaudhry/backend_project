package com.bnta.banking_api.controllers;

import com.bnta.banking_api.models.BasicAccount;
import com.bnta.banking_api.repositories.BasicAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("basic_accounts")
public class BasicAccountController {

    @Autowired
    BasicAccountRepository basicAccountRepository;

//    INDEX
    @GetMapping
    public ResponseEntity<List<BasicAccount>> getBasicAccounts(){
        return new ResponseEntity<>(basicAccountRepository.findAll(), HttpStatus.OK);
    }
//    @GetMapping
//    public ResponseEntity<List<BasicAccount>> getBasicAccountsAndFilter(
//            @RequestParam(required = false, name = "pinnumber") String pinNumber,
//            @RequestParam(required = false, name = "balance") double balance){
//        if (pinNumber != null){
//            return new ResponseEntity<>(basicAccountRepository.findBasicAccountByPinNumber(pinNumber), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(basicAccountRepository.findAll(), HttpStatus.OK);
//    }

//    SHOW
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<BasicAccount>> getBasicAccount(@PathVariable Long id){
        return new ResponseEntity<>(basicAccountRepository.findById(id), HttpStatus.OK);
    }

//    CREATE/POST
    @PostMapping
    public ResponseEntity<BasicAccount> createBasicAccount(@RequestBody BasicAccount newBasicAccount){
        basicAccountRepository.save(newBasicAccount);
        return new ResponseEntity<>(newBasicAccount, HttpStatus.CREATED);
    }

//    DELETE
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> removeBasicAccount(@PathVariable("id") Long id){
        basicAccountRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<Long> removeBasicAccount(@PathVariable("id") Long id){
//        basicAccountRepository.deleteById(id);
//        for (int i = 0; i <= basicAccountRepository.count(); i++){
//            if (id == null){
//                return new ResponseEntity<>(null);
//            }
//        }
//        return new ResponseEntity<>(id, HttpStatus.OK);
//    }

}
