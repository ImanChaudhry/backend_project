package com.bnta.banking_api.components;


import com.bnta.banking_api.models.BasicAccount;
import com.bnta.banking_api.models.JointAccount;
import com.bnta.banking_api.models.Payment;
import com.bnta.banking_api.repositories.BasicAccountRepository;
import com.bnta.banking_api.repositories.PaymentRepository;
import com.bnta.banking_api.models.AccountHolder;
import com.bnta.banking_api.models.Employment;
import com.bnta.banking_api.models.Category;
import com.bnta.banking_api.models.Payment;
import com.bnta.banking_api.models.Subscription;
import com.bnta.banking_api.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
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
    private PaymentRepository paymentRepository;

    @Autowired
    private JointAccountRepository jointAccountRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private SubscriptionRepository subscriptionRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        

        // AccountHolder data
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

      
        //BasicAccount Data
        BasicAccount basicAccount1 = new BasicAccount(true, (float)95847,"1548",accountHolder1);
        BasicAccount basicAccount2 = new BasicAccount(true, (float)12457,"1235",accountHolder2);
        BasicAccount basicAccount3 = new BasicAccount(false, (float)46587,"3245",accountHolder3);
        BasicAccount basicAccount4 = new BasicAccount(true, (float)212458,"7896",accountHolder4);
        BasicAccount basicAccount5 = new BasicAccount(true, (float)9584547,"4565",accountHolder5);
        BasicAccount basicAccount6 = new BasicAccount(false, (float)97847,"1550",accountHolder6);
        BasicAccount basicAccount7 = new BasicAccount(true, (float)14527,"1546",accountHolder7);
        BasicAccount basicAccount8 = new BasicAccount(true, (float)69857,"1658",accountHolder8);
        BasicAccount basicAccount9 = new BasicAccount(false, (float)958,"5448",accountHolder9);
        BasicAccount basicAccount10 = new BasicAccount(true, (float)46581,"9658",accountHolder10);
        basicAccountRepository.saveAll(Arrays.asList(basicAccount1,basicAccount2,basicAccount3,basicAccount4,basicAccount5,basicAccount6,basicAccount7,basicAccount8,basicAccount9,basicAccount10));

        //JointAccount Data
        JointAccount jointAccount1 = new JointAccount(true, (float)124569,"1649", "Partner", Arrays.asList(accountHolder1, accountHolder2));
        JointAccount jointAccount2 = new JointAccount(true,(float)352648 ,"9878", "Housemate", Arrays.asList(accountHolder3, accountHolder4, accountHolder7));
        JointAccount jointAccount3 = new JointAccount(false, (float)545874,"7898", "Parent", Arrays.asList(accountHolder9, accountHolder10));
        JointAccount jointAccount4 = new JointAccount(true, (float)12345,"9467", "Partner", Arrays.asList(accountHolder15, accountHolder13));
        JointAccount jointAccount5 = new JointAccount(false, (float)35658,"6497", "Partner", Arrays.asList(accountHolder5, accountHolder6));
        JointAccount jointAccount6 = new JointAccount(true, (float)54574,"3316", "Partner", Arrays.asList(accountHolder11, accountHolder12));
        JointAccount jointAccount7 = new JointAccount(false, (float)45645,"7894", "Parent", Arrays.asList(accountHolder19, accountHolder18));
        JointAccount jointAccount8 = new JointAccount(true, (float)586212,"9467", "Partner", Arrays.asList(accountHolder14, accountHolder20));
        JointAccount jointAccount9 = new JointAccount(false, (float)987524,"3619", "Partner", Arrays.asList(accountHolder4, accountHolder3));
        JointAccount jointAccount10 = new JointAccount(false, (float)87794,"7892", "Parent", Arrays.asList(accountHolder14, accountHolder16));
        jointAccountRepository.saveAll(Arrays.asList(jointAccount1,jointAccount2,jointAccount3,jointAccount4,jointAccount5,jointAccount6,jointAccount7,jointAccount8,jointAccount9,jointAccount10));
       
        // Payment data
        Payment payment1 = new Payment("Amazon", LocalDate.of(2022, 01,2), (float)9.99, basicAccount1);
        Payment payment2 = new Payment("Gym", LocalDate.of(2022, 02, 29), (float)31.99,basicAccount2);
        Payment payment3 = new Payment("Tesco", LocalDate.of(2022, 4, 01), (float) 80.65, jointAccount10);
        Payment payment4 = new Payment("JD", LocalDate.of(2022, 9, 27),  (float)101.98, basicAccount4);
        Payment payment5 = new Payment("Lidl", LocalDate.of(2022, 2, 29),  (float)50.02,jointAccount5);
        Payment payment6 = new Payment("KFC", LocalDate.of(2022, 2, 7), (float) 5.49, basicAccount7);
        Payment payment7 = new Payment("Odeon", LocalDate.of(2022, 3, 30), (float) 40.36, basicAccount8);
        Payment payment8 = new Payment("Bowling", LocalDate.of(2022, 10, 24), (float)9.87,basicAccount10);
        Payment payment9 = new Payment("Uber", LocalDate.of(2022, 5, 9), (float) 7.99, basicAccount5);
        Payment payment10 = new Payment("Ebay", LocalDate.of(2022, 3, 3), (float) 22.60, basicAccount6);
        Payment payment11 = new Payment("Apple", LocalDate.of(2022, 3, 13), (float) 2080.00,jointAccount9);
        Payment payment12 = new Payment("John Lewis", LocalDate.of(2022, 3, 13), (float) 501.80,jointAccount7);
        Payment payment13 = new Payment("Lidl", LocalDate.of(2022, 1, 11), (float) 15.67, jointAccount6);
        Payment payment14 = new Payment("Nandos", LocalDate.of(2022, 5, 3), (float) 34.45, basicAccount9);
        Payment payment15 = new Payment("B&Q", LocalDate.of(2022, 5, 6), (float) 451.99, jointAccount4);
        Payment payment16 = new Payment("Costa", LocalDate.of(2022, 4, 03), (float) 2.99,basicAccount3);
        Payment payment17 = new Payment("Tesco", LocalDate.of(2022, 3, 6), (float) 43.89, jointAccount7);
        Payment payment18 = new Payment("Currys", LocalDate.of(2022, 13, 3), (float) 302.34,jointAccount3);
        Payment payment19 = new Payment("Gym", LocalDate.of(2022, 3, 3), (float) 31.99, jointAccount6);
        Payment payment20 = new Payment("B&M", LocalDate.of(2022, 2, 16), (float) 18.22, jointAccount4);
        paymentRepository.saveAll(Arrays.asList(payment1, payment2, payment3, payment4, payment5, payment6, payment7,
                                payment8, payment9, payment10, payment11, payment12, payment13, payment14, payment15,
                                payment16, payment17, payment18, payment19, payment20));


        // Subscription data
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
