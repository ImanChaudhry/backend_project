package com.bnta.banking_api.controllers;

import com.bnta.banking_api.models.Category;
import com.bnta.banking_api.models.Subscription;
import com.bnta.banking_api.repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("subscriptions")
public class SubscriptionController {

    @Autowired
    SubscriptionRepository subscriptionRepository;

    @GetMapping
    public ResponseEntity<List<Subscription>> getSubscriptions() {
        return new ResponseEntity<>(subscriptionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/category={category}") //localhost:8080/subscriptions?category=Entertainment
    public ResponseEntity<List<Subscription>> getAllSubscriptionsOfCategory(
            @PathVariable String category){
        String c = category.toUpperCase();
        return new ResponseEntity<>(subscriptionRepository.findByCategory(Category.valueOf(c)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Subscription> createSubscription(@RequestBody Subscription newSubscription) {
        subscriptionRepository.save(newSubscription);
        return new ResponseEntity<>(newSubscription, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteSubscription (@PathVariable("id") Long id) {
        subscriptionRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
