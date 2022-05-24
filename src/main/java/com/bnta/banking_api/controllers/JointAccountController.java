package com.bnta.banking_api.controllers;

import com.bnta.banking_api.models.BasicAccount;
import com.bnta.banking_api.models.JointAccount;
import com.bnta.banking_api.repositories.JointAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("joint_accounts")
public class JointAccountController {

    @Autowired
    JointAccountRepository jointAccountRepository;

//    INDEX
    @GetMapping
    public ResponseEntity<List<JointAccount>> getJointAccounts(){
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
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> removeJointAccount(@PathVariable("id") Long id){
        jointAccountRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


}
