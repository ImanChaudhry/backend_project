package com.bnta.banking_api.repositories;

import com.bnta.banking_api.models.Category;
import com.bnta.banking_api.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    List<Payment> findPaymentsByNameIsContainingIgnoreCase(String name);

    List<Payment> findPaymentsByDateGreaterThanAndDateLessThan(LocalDate from, LocalDate to);

    List<Payment> findPaymentsByCategory(Category category);



}
