package com.bnta.banking_api.controllers;


import com.bnta.banking_api.models.Category;
import com.bnta.banking_api.models.Payment;
import com.bnta.banking_api.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@RestController
@RequestMapping("payments")
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    // INDEX : display all the payments
    @GetMapping
    public ResponseEntity<List<Payment>> getAllPayments(
            @RequestParam(required = false, name = "name") String name
    ){
        if (name != null){
            return new ResponseEntity<>(paymentRepository.findPaymentsByNameIsContainingIgnoreCase(name), HttpStatus.FOUND);
        }

        return new ResponseEntity<>(paymentRepository.findAll(), HttpStatus.OK);
    }

    // SHOW : search the payment by id
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Payment>> getPaymentById(@PathVariable Long id){
        var payment = paymentRepository.findById(id);
        return new ResponseEntity<>(payment, payment.isEmpty()? HttpStatus.NOT_FOUND : HttpStatus.FOUND);
    }

     // SHOW : search payments between time "from" and time "to"
    @GetMapping("/fromdatetime={from}/todatetime={to}")
    public ResponseEntity<List<Payment>> getPaymentsFromDateTimeToDateTime(
            @PathVariable("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from, @PathVariable("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to
    ){
//        LocalDate from_date = LocalDate.parse(from);
//        LocalDate to_date = LocalDate.parse(to);
        List<Payment> found = paymentRepository.findPaymentsByDateGreaterThanAndDateLessThan(from, to);

        return new ResponseEntity<>(found, HttpStatus.FOUND);
    }

    // SHOW : search payments by category
    @GetMapping("/category={category}")
    public ResponseEntity<List<Payment>> searchPaymentByCategory(@PathVariable String category){
        String c = category.toUpperCase();
        return new ResponseEntity<>(paymentRepository.findPaymentsByCategory(Category.valueOf(c)), HttpStatus.FOUND);
    }

    // SHOW : search payments that are greater than
    @GetMapping("/greaterthan={amount}")
    public ResponseEntity<List<Payment>> seearchPaymentGreaterThan(@PathVariable double amount){

        var found = paymentRepository.findPaymentsByAmountGreaterThan(amount);
        return new ResponseEntity<>(found, found.isEmpty() ? HttpStatus.NOT_FOUND: HttpStatus.FOUND);
    }

    // Create
    @PostMapping
    public ResponseEntity<Payment> createNewPayment(@RequestBody Payment payment){
        return new ResponseEntity<>(paymentRepository.save(payment), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete-{id}")
    public void deletePaymentById(@PathVariable Long id){
        Optional<Payment> payment = paymentRepository.findById(id);
        if(payment.isPresent()) {
            Payment found = payment.get();
            found.getAccount().removePayment(found);
            paymentRepository.deleteById(id);
        }

    }



}
