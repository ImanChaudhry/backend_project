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

        Subscription sub1 = new Subscription("Nandos", LocalDate.of(2016, 12, 14), Category.EATING_OUT, (float)54.99, true, basicAccount1);
        Subscription sub2 = new Subscription("Thames Water", LocalDate.of(2020, 9, 12), Category.BILLS, (float)69.99, true, basicAccount3);
        Subscription sub3 = new Subscription("TFL", LocalDate.of(2021, 3, 19), Category.TRANSPORT, (float)59.99, false, basicAccount2);
        Subscription sub4 = new Subscription("Pure Gym", LocalDate.of(2015, 5, 22), Category.HEALTH, (float)24.99, true, basicAccount6);
        Subscription sub5 = new Subscription("Soul Cycle", LocalDate.of(2009, 8, 24), Category.HEALTH, (float)149.99, false, basicAccount7);
        Subscription sub6 = new Subscription("O2", LocalDate.of(2012, 2, 28), Category.BILLS, (float)14.99, false, basicAccount8);
        Subscription sub7 = new Subscription("Netflix", LocalDate.of(2017, 11, 23), Category.ENTERTAINMENT, (float)14.99, true, basicAccount9);
        Subscription sub8 = new Subscription("Tesco", LocalDate.of(2019, 10, 30), Category.SHOPPING, (float)44.99, false, basicAccount10);
        Subscription sub9 = new Subscription("Farah Charity", LocalDate.of(2014, 6, 1), Category.CHARITY, (float)64.99, true, basicAccount4);
        Subscription sub10 = new Subscription("Easy Jet", LocalDate.of(2013, 4, 13), Category.OTHER, (float)84.99, true, basicAccount5);
        Subscription sub11 = new Subscription("Tastily prepared meals", LocalDate.of(2017, 7, 30), Category.OTHER, (float)23.99, true, jointAccount4);
        Subscription sub12 = new Subscription("British Red Cross", LocalDate.of(2016, 4, 13), Category.CHARITY, (float)34.99, false, jointAccount3);
        Subscription sub13 = new Subscription("Sainsburys", LocalDate.of(2019, 3, 15), Category.SHOPPING, (float)65.99, false, jointAccount2);
        Subscription sub14 = new Subscription("TFL", LocalDate.of(2015, 5, 12), Category.TRANSPORT, (float)23.99, true, jointAccount1);
        Subscription sub15 = new Subscription("Spotify", LocalDate.of(2017, 9, 16), Category.ENTERTAINMENT, (float)4.99, false, jointAccount10);
        Subscription sub16 = new Subscription("Thames Water", LocalDate.of(2020, 12, 2), Category.BILLS, (float)55.99, true, jointAccount9);
        Subscription sub17 = new Subscription("Pure Gym", LocalDate.of(2021, 10, 23), Category.HEALTH, (float)12.99, true, jointAccount8);
        Subscription sub18 = new Subscription("Taco Bell", LocalDate.of(2022, 3, 29), Category.EATING_OUT, (float)42.99, false, jointAccount7);
        Subscription sub19 = new Subscription("National Grid", LocalDate.of(2004, 5, 23), Category.BILLS, (float)68.99, true, jointAccount6);
        Subscription sub20 = new Subscription("Netflix", LocalDate.of(2019, 2, 8), Category.ENTERTAINMENT, (float)9.99, true, jointAccount5);
        subscriptionRepository.saveAll(Arrays.asList(sub1,sub2, sub3, sub4, sub5, sub6, sub7, sub8, sub9, sub10,sub11,
                sub12, sub13, sub14, sub15, sub16, sub17, sub18, sub19, sub20));
    }
}
