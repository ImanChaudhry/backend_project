package com.bnta.banking_api.components;

import com.bnta.banking_api.repositories.BasicAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private BasicAccountRepository basicAccountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
