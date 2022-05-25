package com.bnta.banking_api;

import com.bnta.banking_api.models.AccountHolder;
import com.bnta.banking_api.models.Account;
import com.bnta.banking_api.models.Employment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class BankingApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(BankingApiApplication.class, args);
	}

}
