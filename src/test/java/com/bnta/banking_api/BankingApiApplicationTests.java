package com.bnta.banking_api;

import com.bnta.banking_api.models.Account;
import com.bnta.banking_api.models.Category;
import com.bnta.banking_api.models.Subscription;
import com.bnta.banking_api.repositories.AccountHolderRepository;
import com.bnta.banking_api.repositories.AccountRepository;
import com.bnta.banking_api.repositories.PaymentRepository;
import com.bnta.banking_api.repositories.SubscriptionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class BankingApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private SubscriptionRepository subscriptionRepository;

	@Autowired
	private AccountHolderRepository accountHolderRepository;

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private PaymentRepository paymentRepository;

	@Test
	public void testFindByCategory() {
		assertThat(subscriptionRepository.findByCategory(Category.BILLS)).isNotNull();
		assertThat(subscriptionRepository.findByCategory(Category.BILLS).size()).isEqualTo(4);
	}

	@Test
	public void testFindByPriceGreaterThan() {
		assertThat(subscriptionRepository.findByPriceGreaterThan(100).size()).isEqualTo(1);
	}

	@Test
	public void testFindByIsActiveEquals(){
		assertThat(subscriptionRepository.findByIsActiveEquals(true).size()).isEqualTo(12);
	}

	@Test
	public void testFindByDateOfPaymentEquals(){
		assertThat(subscriptionRepository.findByDateOfPaymentEquals(LocalDate.of(2016,12,14)).size()).isEqualTo(1);
	}
}
