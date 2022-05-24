package com.bnta.banking_api.components;

import com.bnta.banking_api.models.BasicAccount;
import com.bnta.banking_api.models.JointAccount;
import com.bnta.banking_api.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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

        //BasicAccount Data
        BasicAccount basicAccount1 = new BasicAccount(true, 95847,1548,accountHolder1);
        BasicAccount basicAccount2 = new BasicAccount(true, 12457,1235,accountHolder2);
        BasicAccount basicAccount3 = new BasicAccount(false, 46587,3245,accountHolder3);
        BasicAccount basicAccount4 = new BasicAccount(true, 212458,7896,accountHolder4);
        BasicAccount basicAccount5 = new BasicAccount(true, 9584547,4565,accountHolder5);
        BasicAccount basicAccount6 = new BasicAccount(false, 97847,1550,accountHolder6);
        BasicAccount basicAccount7 = new BasicAccount(true, 14527,1546,accountHolder7);
        BasicAccount basicAccount8 = new BasicAccount(true, 69857,1658,accountHolder8);
        BasicAccount basicAccount9 = new BasicAccount(false, 958,5448,accountHolder9);
        BasicAccount basicAccount10 = new BasicAccount(true, 46581,9658,accountHolder10);

        //JointAccount Data
        JointAccount jointAccount1 = new JointAccount(true, 124569,1649, "Partner", Arrays.asList(accountHolder1, accountHolder2));
        JointAccount jointAccount2 = new JointAccount(true,352648 ,9878, "Housemate", Arrays.asList(accountHolder3, accountHolder4, accountHolder7));
        JointAccount jointAccount3 = new JointAccount(false, 545874,7898, "Parent", Arrays.asList(accountHolder9, accountHolder10));
        JointAccount jointAccount4 = new JointAccount(true, 12345,9467, "Partner", Arrays.asList(accountHolder15, accountHolder13));
        JointAccount jointAccount5 = new JointAccount(false, 35658,6497, "Partner", Arrays.asList(accountHolder5, accountHolder6));
        JointAccount jointAccount6 = new JointAccount(true, 54574,3316, "Partner", Arrays.asList(accountHolder11, accountHolder12));
        JointAccount jointAccount7 = new JointAccount(false, 45645,7894, "Parent", Arrays.asList(accountHolder19, accountHolder18));
        JointAccount jointAccount8 = new JointAccount(true, 586212,9467, "Partner", Arrays.asList(accountHolder14, accountHolder20));
        JointAccount jointAccount9 = new JointAccount(false, 987524,3619, "Partner", Arrays.asList(accountHolder4, accountHolder3));
        JointAccount jointAccount10 = new JointAccount(false, 87794,7892, "Parent", Arrays.asList(accountHolder14, accountHolder16));




    }
}
