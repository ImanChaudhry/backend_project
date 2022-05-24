package com.bnta.banking_api.components;

import com.bnta.banking_api.models.Category;
import com.bnta.banking_api.models.Payment;
import com.bnta.banking_api.models.Subscription;
import com.bnta.banking_api.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

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

        Subscription sub1 = new Subscription("Nandos", LocalDate.of(2016, 12, 14),
                Category.EATING_OUT, (float)54.99, true, bassicAccount1);
        Subscription sub2 = new Subscription("Thames Water", LocalDate.of(2020, 9, 12),
                Category.BILLS, (float)69.99, true, bassicAccount3);
        Subscription sub3 = new Subscription("TFL", LocalDate.of(2021, 3, 19),
                Category.TRANSPORT, (float)59.99, false, bassicAccount2);
        Subscription sub4 = new Subscription("Pure Gym", LocalDate.of(2015, 5, 22),
                Category.HEALTH, (float)24.99, true, bassicAccount6);
        Subscription sub5 = new Subscription("Soul Cycle", LocalDate.of(2009, 8, 24),
                Category.HEALTH, (float)149.99, false, bassicAccount7);
        Subscription sub6 = new Subscription("O2", LocalDate.of(2012, 2, 28),
                Category.BILLS, (float)14.99, false, bassicAccount8);
        Subscription sub7 = new Subscription("Cine World Cinema", LocalDate.of(2017, 11, 23),
                Category.ENTERTAINMENT, (float)29.99, true, bassicAccount9);
        Subscription sub8 = new Subscription("Tesco", LocalDate.of(2019, 10, 30),
                Category.SHOPPING, (float)44.99, false, bassicAccount10);
        Subscription sub9 = new Subscription("Farah Charity", LocalDate.of(2014, 6, 1),
                Category.CHARITY, (float)64.99, true, bassicAccount4);
        Subscription sub10 = new Subscription("Easy Jet", LocalDate.of(2013, 4, 13),
                Category.OTHER, (float)84.99, true, bassicAccount5);
        subscriptionRepository.saveAll(Arrays.asList(sub1,sub2, sub3, sub4, sub5, sub6, sub7, sub8, sub9, sub10));
    }
}
