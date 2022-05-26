package com.bnta.banking_api;

import com.bnta.banking_api.models.Account;
import com.bnta.banking_api.repositories.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class BankingApiApplicationTests {


	@Autowired
	AccountRepository accountRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canFindAccountByBalanceGreaterThan100000(){
		List<Account> found = accountRepository.findAccountByBalanceGreaterThan(100000);
		assertThat(found.size()).isEqualTo(3);
	}

	@Test
	public void canFindBasicAccountByPinNumberAndBalance(){
		List<Account> found = accountRepository.findBasicAccountByPinNumberAndBalance("1649", 12469);
		assertThat(found.size()).isEqualTo(1);
	}

	@Test
	public void canFindJointAccountByRelationshipIsContainingIgnoreCase(){
		List<Account> found = accountRepository.findJointAccountByRelationshipIsContainingIgnoreCase("housemate");
		assertThat(found.size()).isEqualTo(3);
	}

}
