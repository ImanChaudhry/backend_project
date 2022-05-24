package com.bnta.banking_api.components;

import com.bnta.banking_api.models.Payment;
import com.bnta.banking_api.repositories.BasicAccountRepository;
import com.bnta.banking_api.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private BasicAccountRepository basicAccountRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
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

    }
}
