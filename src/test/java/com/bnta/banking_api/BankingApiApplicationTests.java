package com.bnta.banking_api;

import com.bnta.banking_api.models.Account;
import com.bnta.banking_api.models.AccountHolder;
import com.bnta.banking_api.repositories.AccountHolderRepository;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BankingApiApplicationTests {

	@Autowired
	AccountHolderRepository accountHolderRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void findAccountHolderByName(){
		List<AccountHolder> found = this.accountHolderRepository.findAccountHolderByName("Kim Ye");
		AssertionsForClassTypes.assertThat(found.size()).isEqualTo(1);
	}

	@Test
	public void findAccountHolderByDob(){
		List<AccountHolder> found = this.accountHolderRepository.findAccountHolderByDob(LocalDate.of(1995, 5, 15));
		AssertionsForClassTypes.assertThat(found.size()).isEqualTo(1);
	}

	@Test
	public void findAccountHolderByAddress(){
		List<AccountHolder> found = this.accountHolderRepository.findAccountHolderByAddress("Boston Street, London");
		AssertionsForClassTypes.assertThat(found.size()).isEqualTo(1);
	}

	@Test
	public void findAccountHolderByEmploymentStatus(){
		List<AccountHolder> found = this.accountHolderRepository.findAccountHolderByName("Jess Blue");
		AssertionsForClassTypes.assertThat(found.size()).isEqualTo(1);
	}

}
