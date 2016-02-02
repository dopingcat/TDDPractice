package bankbiztest;

import bankbiz.Account;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class AccountTest {
	// 계좌 생성 테스트
	@Test
	public void accountTest() {
		Account account = new Account();
		assertNotNull(account);
	}

	// 잔고 조회 테스트
	@Test
	public void getBalanceTest() {
		Account account = new Account(10000);
		assertThat(account.getBalance(), is(10000));
	}
}
