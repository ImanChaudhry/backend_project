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
        Payment payment1 = new Payment("Amazon", LocalDate.of(2022, 01,2), 9.99, basicAccount1);
        Payment payment2 = new Payment("Gym", LocalDate.of(2022, 02, 29), 31.99,basicAccount2);
        Payment payment3 = new Payment("Tesco", LocalDate.of(2022, 4, 01), 80.65, jointAccount1);
        Payment payment4 = new Payment("JD", LocalDate.of(2022, 9, 27), 101.98, basicAccount2);
        Payment payment5 = new Payment("Lidl", LocalDate.of(2022, 2, 29), 50.02,jointAccount2);
        Payment payment6 = new Payment("KFC", LocalDate.of(2022, 2, 7), 5.49, basicAccount3);
        Payment payment7 = new Payment("Odeon", LocalDate.of(2022, 3, 30), 40.36, basicAccount2);
        Payment payment8 = new Payment("Bowling", LocalDate.of(2022, 10, 24), 9.87,basicAccount1);
        Payment payment9 = new Payment("Uber", LocalDate.of(2022, 5, 9), 7.99, basicAccount2);
        Payment payment10 = new Payment("Ebay", LocalDate.of(2022, 3, 3), 22.60, basicAccount3);
        Payment payment11 = new Payment("Apple", LocalDate.of(2022, 3, 13), 2080.00,jointAccount2);
        Payment payment12 = new Payment("John Lewis", LocalDate.of(2022, 3, 13), 501.80,jointAccount2);
        Payment payment13 = new Payment("Lidl", LocalDate.of(2022, 1, 11), 15.67, jointAccount1);
        Payment payment14 = new Payment("Nandos", LocalDate.of(2022, 5, 3), 34.45, basicAccount1);
        Payment payment15 = new Payment("B&Q", LocalDate.of(2022, 5, 6), 451.99, jointAccount1);
        Payment payment16 = new Payment("Costa", LocalDate.of(2022, 4, 03), 2.99,basicAccount3);
        Payment payment17 = new Payment("Tesco", LocalDate.of(2022, 3, 6), 43.89, jointAccount1);
        Payment payment18 = new Payment("Currys", LocalDate.of(2022, 13, 3), 302.34,jointAccount2);
        Payment payment19 = new Payment("Gym", LocalDate.of(2022, 3, 3), 31.99, basicAccount2);
        Payment payment20 = new Payment("B&M", LocalDate.of(2022, 2, 16), 18.22, jointAccount2);
        paymentRepository.saveAll(Arrays.asList(payment1, payment2, payment3, payment4, payment5, payment6, payment7,
                                payment8, payment9, payment10, payment11, payment12, payment13, payment14, payment15,
                                payment16, payment17, payment18, payment19, payment20));

    }
}
