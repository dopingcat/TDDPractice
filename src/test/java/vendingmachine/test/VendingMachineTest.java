package vendingmachine.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vendingmachine.VendingMachine;
import vendingmachine.drink.Drink;

public class VendingMachineTest {
	@Test
	public void testGetChangeAmount() throws Exception {
		VendingMachine machine = createVendingMachine();

		assertEquals("투입금액 없음", 0, machine.getChaneAmount());

		machine.putCoin(100);
		assertEquals("투입금액 100원", 100, machine.getChaneAmount());

		machine.putCoin(500);
		assertEquals("추가 투입금액 500원", 600, machine.getChaneAmount());
	}

	@Test
	public void testSelectDrink() throws Exception {
		VendingMachine machine = createVendingMachine();

		machine.selectDrink(new Drink("Cola", 500));
		assertEquals("500원 음료 선택", 0, machine.getChaneAmount());

		machine.putCoin(500);
		machine.selectDrink(new Drink("Cola", 500));
		assertEquals("500원 투입 후 500원 음료 선택", 0, machine.getChaneAmount());

		machine.putCoin(500);
		machine.selectDrink(new Drink("Cola", 300));
		assertEquals("500원 투입 후 300원 음료 선택", 200, machine.getChaneAmount());
	}

	private VendingMachine createVendingMachine() {
		VendingMachine machine = new VendingMachine();
		return machine;
	}
}