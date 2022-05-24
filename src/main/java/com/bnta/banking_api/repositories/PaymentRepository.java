package com.bnta.banking_api.repositories;

import com.bnta.banking_api.models.Category;
import com.bnta.banking_api.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    List<Payment> findPaymentsByNameIsContainingIgnoreCase(String name);

    List<Payment> findPaymentsByDateGreaterThanAndDateLessThan(LocalDate from, LocalDate to);

    List<Payment> findPaymentsByCategory(Category category);

    List<Payment> findPaymentsByAmountGreaterThan(double amount);

    List<Payment> findPaymentsByNameEqualsIgnoreCase(String name);

    List<Payment> findPaymentsByDateEquals(LocalDate date);

    @Query("SELECT p FROM payment")
    List<Payment> findPaymentsByAccountId(Long id);



}
