package com.bnta.banking_api;

import com.bnta.banking_api.models.Category;
import com.bnta.banking_api.models.Payment;
import com.bnta.banking_api.repositories.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class BankingApiApplicationTests {

	@Autowired
	PaymentRepository paymentRepository;


	@Test
	void contextLoads() {
	}




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



}
