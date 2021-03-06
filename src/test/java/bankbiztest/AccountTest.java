package bankbiztest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import bankbiz.Account;

public class AccountTest {
	private Account account;

	private Account openAccount(int money) {
		return new Account(money);
	}

	@Before
	public void setup() {
		account = openAccount(10000);
	}

	@Test
	public void accountTest() {
		assertNotNull(account);
	}

	@Test
	public void getBalanceTest() {
		assertEquals(10000, account.getBalance());
	}

	@Test
	public void depositTest() {
		assertEquals(10000, account.getBalance());

		account.deposit(0);
		assertEquals(10000, account.getBalance());

		account.deposit(10000);
		assertEquals(20000, account.getBalance());
	}

	@Test
	public void withdrawTest() {
		assertEquals(10000, account.getBalance());
		account.withdraw(0);
		assertEquals(10000, account.getBalance());

		account.withdraw(10000);
		assertEquals(0, account.getBalance());
	}
}