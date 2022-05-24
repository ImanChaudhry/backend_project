package com.bnta.banking_api.repositories;

import com.bnta.banking_api.models.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
