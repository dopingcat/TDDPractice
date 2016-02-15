package vendingmachine;

import vendingmachine.coin.CoinSet;
import vendingmachine.drink.Drink;

public class VendingMachine {
	private int changeAmount;
	private CoinSet coinSet = new CoinSet();

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

	public CoinSet getChangeCoinSet() {
		coinSet.add(changeAmount);
		return coinSet;
	}
}