package com.bnta.banking_api.repositories;

import com.bnta.banking_api.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
