package bankbiztest;

import bankbiz.Account;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
	// 계좌 생성 테스트
	@Test
	public void accountTest() {
		Account account = new Account(0);
		assertNotNull(account);
	}

	// 잔고 조회 테스트
	@Test
	public void getBalanceTest() {
		Account account = new Account(10000);
		assertEquals(10000, account.getBalance());

		account = new Account(0);
		assertEquals(0, account.getBalance());
	}

	// 입금 테스트
	@Test
	public void depositTest() {
		Account account = new Account(0);
		account.deposit(10000);
		assertEquals(10000, account.getBalance());
	}

	// 출금 테스트
	@Test
	public void withdrawTest() {
		Account account = new Account(10000);
		account.withdraw(10000);
		assertEquals(0, account.getBalance());
	}
}
