package bankbiz;

public class Account {
	private int balance;

	public Account(int deposit) {
		this.balance = deposit;
	}

	public int getBalance() {
		return balance;
	}
}
