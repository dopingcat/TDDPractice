package bankbiztest;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
	@Test
	public void accountTest() {
		Account account = new Account();
		assertNotNull(account);
	}
}
