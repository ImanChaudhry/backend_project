package com.bnta.banking_api.components;

import com.bnta.banking_api.models.AccountHolder;
import com.bnta.banking_api.models.Employment;
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

        // Account Holder objects
        AccountHolder accountHolder1 = new AccountHolder("Aisha Mohamed", LocalDate.of(2000, 2, 23), "Abc Street, London", Employment.FULL_TIME);
        AccountHolder accountHolder2 = new AccountHolder("Mohamed Khaled", LocalDate.of(1995, 5, 15), "Sunny Street, London", Employment.FULL_TIME);
        AccountHolder accountHolder3 = new AccountHolder("Iman Chaudhry", LocalDate.of(1999, 12, 18), "Canning Street, London", Employment.FULL_TIME);
        AccountHolder accountHolder4 = new AccountHolder("Kim Ye", LocalDate.of(1997, 7, 25), "Boston Street, London", Employment.FULL_TIME);
        AccountHolder accountHolder5 = new AccountHolder("John Chris", LocalDate.of(1987, 10, 13), "Rebe Road, Manchester", Employment.FULL_TIME);
        AccountHolder accountHolder6 = new AccountHolder("Micheal Kayn", LocalDate.of(2002, 6, 3), "Hight Street, Manchester", Employment.STUDENT);
        AccountHolder accountHolder7 = new AccountHolder("Jake Willing", LocalDate.of(1875, 10, 8), "Lathon Road, Manchester", Employment.UNEMPLOYED);
        AccountHolder accountHolder8 = new AccountHolder("Rebeca Jones", LocalDate.of(1995, 1, 3), "Albion Road, London", Employment.SELF_EMPLOYED);
        AccountHolder accountHolder9 = new AccountHolder("Chelsea Sky", LocalDate.of(2005, 7, 16), "Junction Road, Birmingham", Employment.STUDENT);
        AccountHolder accountHolder10 = new AccountHolder("Gwen Dennis", LocalDate.of(1965, 3, 4), "Dulverton Road, Birmingham", Employment.UNEMPLOYED);
        AccountHolder accountHolder11 = new AccountHolder("Jonas Fred", LocalDate.of(1988, 4, 13), "Electric Street, Birmingham", Employment.SELF_EMPLOYED);
        AccountHolder accountHolder12 = new AccountHolder("Sebastian Joy", LocalDate.of(1999, 11, 30), "Whitechapel Street, Liverpool", Employment.PART_TIME);
        AccountHolder accountHolder13 = new AccountHolder("Kylie Goldman", LocalDate.of(1877, 1, 28), "Duke Road, Liverpool", Employment.PART_TIME);
        AccountHolder accountHolder14 = new AccountHolder("Jess Blue", LocalDate.of(1989, 8, 8), "Argyle Street, Liverpool", Employment.OTHER);
        AccountHolder accountHolder15 = new AccountHolder("Amber Wise", LocalDate.of(1996, 11, 23), "Seddon Road, London", Employment.OTHER);
        AccountHolder accountHolder16 = new AccountHolder("Jane Josh", LocalDate.of(2005, 6, 3), "Blundell Street, London", Employment.STUDENT);
        AccountHolder accountHolder17 = new AccountHolder("Kale Wills", LocalDate.of(2004, 9, 9), "Hill Road, Manchester", Employment.STUDENT);
        AccountHolder accountHolder18 = new AccountHolder("Ander Boss", LocalDate.of(1992, 12, 29), "Cary Street, London", Employment.FULL_TIME);
        AccountHolder accountHolder19 = new AccountHolder("Billie Ele", LocalDate.of(1991, 5, 26), "Park Street, Manchester", Employment.FULL_TIME);
        AccountHolder accountHolder20 = new AccountHolder("Matty Dan", LocalDate.of(1977, 10, 4), "Park Road, London", Employment.OTHER);

        accountHolderRepository.saveAll(Arrays.asList(accountHolder1, accountHolder2, accountHolder3, accountHolder4, accountHolder5, accountHolder6, accountHolder7, accountHolder8, accountHolder9,
                accountHolder10, accountHolder11, accountHolder12, accountHolder13, accountHolder14, accountHolder15, accountHolder16, accountHolder17,
                accountHolder18, accountHolder19, accountHolder20));










    }

}
