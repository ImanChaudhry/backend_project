package com.bnta.banking_api.components;

import com.bnta.banking_api.models.Payment;
import com.bnta.banking_api.models.Subscription;
import com.bnta.banking_api.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    private AccountHolderRepository accountHolderRepository;

    @Autowired
    private BasicAccountRepository basicAccountRepository;

    @Autowired
    private JointAccountRepository jointAccountRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private SubscriptionRepository subscriptionRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
    }
}
