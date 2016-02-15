package vendingmachine.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vendingmachine.VendingMachine;

public class VendingMachineTest {
	@Test	// 잔액 확인
	public void testGetChangeAmount() throws Exception {
		VendingMachine machine = new VendingMachine();

		assertEquals("투입금액 없음", 0, machine.getChaneAmount());

		machine.putCoin(100);
		assertEquals("투입금액 100원", 100, machine.getChaneAmount());

		machine.putCoin(500);
		assertEquals("추가 투입금액 500원", 600, machine.getChaneAmount());
	}
}