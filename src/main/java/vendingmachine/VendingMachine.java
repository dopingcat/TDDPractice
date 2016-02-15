package vendingmachine;

import vendingmachine.drink.Drink;

public class VendingMachine {
	private int changeAmount;

	public void putCoin(int coin) {
		changeAmount += coin;
	}

	public int getChaneAmount() {
		return changeAmount;
	}

	public void selectDrink(Drink drink) {
		if(changeAmount >= drink.getPrice())
			changeAmount -= drink.getPrice();
	}
}
