package vendingmachine;

import vendingmachine.coin.CoinSet;
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

	public CoinSet getChangeCoinSet() {
		return getCoinSet(changeAmount);
	}

	public CoinSet getCoinSet(int changeAmount) {
		CoinSet coinSet = new CoinSet();

		while(changeAmount >= 500) {
			changeAmount -= 500;
			coinSet.add(500);
		}

		while(changeAmount >= 100) {
			changeAmount -= 100;
			coinSet.add(100);
		}

		while(changeAmount >= 50) {
			changeAmount -= 50;
			coinSet.add(50);
		}

		while(changeAmount >= 10) {
			changeAmount -= 10;
			coinSet.add(10);
		}

		return coinSet;
	}
}