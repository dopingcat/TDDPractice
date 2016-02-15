package vendingmachine;

public class VendingMachine {
	private int changeAmount;

	public void putCoin(int coin) {
		changeAmount += coin;
	}

	public int getChaneAmount() {
		return changeAmount;
	}
}