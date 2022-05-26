package com.bnta.banking_api;

<<<<<<< HEAD
import com.bnta.banking_api.models.Category;
import com.bnta.banking_api.models.Payment;
import com.bnta.banking_api.repositories.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;
=======
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
>>>>>>> 11c3057e4664165678d7fef2d580a1d4f221f3aa

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class BankingApiApplicationTests {

	@Resource
	PaymentRepository paymentRepository;


	@Test
	void contextLoads() {
	}

<<<<<<< HEAD



	// Tests for payments

	@Test // find payment by piece of words
	public void canFindPaymentsByNameIsContainingIgnoreCase(){
		List<Payment> found = paymentRepository.findPaymentsByNameIsContainingIgnoreCase("tes");
		assertThat(found.size()).isEqualTo(2);
	}

	@Test
	public void canFindPaymentsByDateGreaterThanAndDateLessThan(){
		List<Payment> found = paymentRepository.findPaymentsByDateGreaterThanAndDateLessThan(
				LocalDate.of(2022,01,01), LocalDate.of(2022,03,01));
		assertThat(found.size()).isEqualTo(4);
	}

	@Test
	public void canFindPaymentsByCategory(){
		List<Payment> found = paymentRepository.findPaymentsByCategory(Category.SHOPPING);
		assertThat(found.size()).isEqualTo(11);
	}

	@Test
	public void canFindPaymentsByAmountGreaterThan(){
		List<Payment> found = paymentRepository.findPaymentsByAmountGreaterThan(50);
		assertThat(found.size()).isEqualTo(7);
	}

	@Test // find payment by exact name but ignores cases
	public void canFindPaymentsByNameEqualsIgnoreCase(){
		List<Payment> found = paymentRepository.findPaymentsByNameEqualsIgnoreCase("lidl");
		assertThat(found.size()).isEqualTo(2);
	}

	@Test
	public void canFindPaymentsByDateEquals(){
		List<Payment> found = paymentRepository.findPaymentsByDateEquals(LocalDate.of(2022,03,13));
		assertThat(found.size()).isEqualTo(2);
	}

	@Test
	public void canFindPaymentsByAccountId(){
		List<Payment> found = paymentRepository.findPaymentsByAccountId(1L);
		assertThat(found.size()).isEqualTo(1);
	}

	@Test
	public void canFindPaymentsByAccountHolderName(){
		List<Payment> found = paymentRepository.findPaymentsByAccountHolderName("kim");
		assertThat(found.size()).isEqualTo(3);
	}



=======
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
>>>>>>> 11c3057e4664165678d7fef2d580a1d4f221f3aa
}
