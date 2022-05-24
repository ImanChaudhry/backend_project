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

        Subscription sub1 = new Subscription("agsng", LocalDate.of(2016, 12, 14), Category.EATING_OUT, (float)54.99, true, bassicAccount1);
        Subscription sub2 = new Subscription("agsng", LocalDate.of(2020, 9, 12), Category.EATING_OUT, (float)69.99, true, bassicAccount1);
        Subscription sub3 = new Subscription("agsng", LocalDate.of(2021, 3, 19), Category.EATING_OUT, (float)59.99, false, bassicAccount1);
        Subscription sub4 = new Subscription("agsng", LocalDate.of(2015, 5, 22), Category.EATING_OUT, (float)24.99, true, bassicAccount1);
        Subscription sub5 = new Subscription("agsng", LocalDate.of(2009, 8, 24), Category.EATING_OUT, (float)99.99, false, bassicAccount1);
        Subscription sub6 = new Subscription("agsng", LocalDate.of(2012, 2, 28), Category.EATING_OUT, (float)14.99, false, bassicAccount1);
        Subscription sub7 = new Subscription("agsng", LocalDate.of(2017, 11, 23), Category.EATING_OUT, (float)29.99, true, bassicAccount1);
        Subscription sub8 = new Subscription("agsng", LocalDate.of(2019, 10, 30), Category.EATING_OUT, (float)44.99, false, bassicAccount1);
        Subscription sub9 = new Subscription("agsng", LocalDate.of(2014, 6, 1), Category.EATING_OUT, (float)64.99, true, bassicAccount1);
        Subscription sub10 = new Subscription("agsng", LocalDate.of(2013, 4, 13), Category.EATING_OUT, (float)84.99, true, bassicAccount1);
    }
}
